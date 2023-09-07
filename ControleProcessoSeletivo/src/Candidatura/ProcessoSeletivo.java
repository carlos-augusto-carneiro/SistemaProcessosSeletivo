package Candidatura;

import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	 
	public static void main(String[] args) {
		imprimirSelecionados();
	}
	
	static void imprimirSelecionados() {
		String [] candidatos = {"HERNANDO", "MARIA", "ADRIANA", "CARLOS", "ELOAN"};
		
		System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
		
		for (int indice = 0; indice < candidatos.length; indice++) {
			System.out.println("O candidato de nº " + (indice+1) + candidatos[indice]);
		}
		
		System.out.println("Forma abreviada de intereção for each");
		
		for (String candidato: candidatos) {
			System.out.println("O candidato selecionado foi " + candidato);
		}
	}
	
	
	static void selecaoCandidatos() {
		
		String [] candidatos = {"VANIA", "MIGUEL", "GABRIEL", "DAVI", "ALINE", "HERNANDO", "MARIA", "ADRIANA", "CARLOS", "ELOAN"};
		
		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase = 2000.0;
		
		
		while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + " Solicitou este valor de salário" + salarioPretendido);
			
			if (salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
				candidatosSelecionados++;
			}
			candidatosAtual++;
		}
		
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if (salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		}
		else if (salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		}
		else {
			System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}
}
