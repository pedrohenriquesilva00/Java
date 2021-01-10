package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		
		// Criando itens para a lista
		String aula01 = "Conhecendo mais de listas";
		String aula02 = "Modelando a classe Aula";
		String aula03 = "Trabalhando com Cursos e Sets";
		
		// Cria uma lista do tipo String que guardará as aulas
		ArrayList<String> aulas = new ArrayList<>();
		
		// Adiciona os itens na lista
		aulas.add(aula01);
		aulas.add(aula02);
		aulas.add(aula03);
		
		// Imprime no console a lista
		System.out.println(aulas);
		
		// Remove o primeiro item da lista
		aulas.remove(0);
		
		// Imprime no console a lista
		System.out.println(aulas);
		
		// foreach para percorrer a lista e imprimir um item por linha. lê-se da seguinte maneira:
		// para cada String aula dentro de aulas faça o seguinte
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}
		
		// // Busca o primeiro item da lista
		String primeiraAula = aulas.get(0);
		
		// Imprime no console o primeiro item da lista
		System.out.println("A primeira aula é: " + primeiraAula);
		
		// Outra forma de percorrer a lista
		for(int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula: " + aulas.get(i));
		}
		
		// Forma mais atual de percorrer uma lista incluído no Java 8
		aulas.forEach(aula -> {
			System.out.println("Percorrendo");
			System.out.println(aula);
		});
		
		// Adicionando mais um item a lista
		aulas.add("Aumentando nosso conhecimento");
		
		// Imprimindo a lista fora de ordem
		System.out.println(aulas);
		
		// Ordenando a lista
		Collections.sort(aulas);
		
		// Imprime a lista organizada por ordem alfabética
		System.out.println("Depois de ordenado");
		System.out.println(aulas);
	}
}
