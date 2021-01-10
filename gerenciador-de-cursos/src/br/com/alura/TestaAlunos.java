package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class TestaAlunos {

	public static void main(String[] args) {
		
		//Cria uma coleção ou conjunto
		//Set<String> alunos = new HashSet<>();
		
		// Cria uma coleção ou conjunto mais genérico
		Collection<String> alunos = new HashSet<>();
		
		// Adiciona alunos no conjunto
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sérgio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Maurício Aniche");
		
		// Percorre o conjunto
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		// Percorre o conjunto. Java 8
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
	}
}
