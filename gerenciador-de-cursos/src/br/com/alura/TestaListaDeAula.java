package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
	
	public static void main(String[] args) {
		
		// Cria refer�ncias do tipo Aula
		Aula a1 = new Aula("Revisitando as ArrayLists", 21);
		Aula a2 = new Aula("Listas de objetos", 20);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
		
		// Cria uma lista que s� guardar� Aulas
		ArrayList<Aula> aulas = new ArrayList<>();
		
		// Adiciona as refer�ncias na lista
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		// Imprime no console as aulas da lista
		System.out.println(aulas);
		
		// Organiza a lista em ordem alfab�tica
		Collections.sort(aulas);
		
		// Imprime o tipo de ordem a seguir
		System.out.println("Ordem Alfab�tica:");
		// Imprime a lista ordenada
		System.out.println(aulas);
		
		// Pode ser lida como: "ordene estas aulas utilizando como
		// compara��o o retorno do m�todo getTempo de cada Aula".
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		// Imprime o tipo de ordem a seguir
		System.out.println("Ordem Num�rica:");
		// Imprime a lista ordenada
		System.out.println(aulas);
	}
}
