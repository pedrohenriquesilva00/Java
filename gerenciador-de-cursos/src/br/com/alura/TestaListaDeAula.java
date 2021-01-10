package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
	
	public static void main(String[] args) {
		
		// Cria referências do tipo Aula
		Aula a1 = new Aula("Revisitando as ArrayLists", 21);
		Aula a2 = new Aula("Listas de objetos", 20);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
		
		// Cria uma lista que só guardará Aulas
		ArrayList<Aula> aulas = new ArrayList<>();
		
		// Adiciona as referências na lista
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		// Imprime no console as aulas da lista
		System.out.println(aulas);
		
		// Organiza a lista em ordem alfabética
		Collections.sort(aulas);
		
		// Imprime o tipo de ordem a seguir
		System.out.println("Ordem Alfabética:");
		// Imprime a lista ordenada
		System.out.println(aulas);
		
		// Pode ser lida como: "ordene estas aulas utilizando como
		// comparação o retorno do método getTempo de cada Aula".
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		// Imprime o tipo de ordem a seguir
		System.out.println("Ordem Numérica:");
		// Imprime a lista ordenada
		System.out.println(aulas);
	}
}
