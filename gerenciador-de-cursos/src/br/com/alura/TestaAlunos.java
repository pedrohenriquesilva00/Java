package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class TestaAlunos {

	public static void main(String[] args) {
		
		//Cria uma cole��o ou conjunto
		//Set<String> alunos = new HashSet<>();
		
		// Cria uma cole��o ou conjunto mais gen�rico
		Collection<String> alunos = new HashSet<>();
		
		// Adiciona alunos no conjunto
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("S�rgio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Maur�cio Aniche");
		
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
