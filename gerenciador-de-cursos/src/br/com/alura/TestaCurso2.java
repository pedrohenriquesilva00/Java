package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		
		// Cria uma referência do tipo Curso
		Curso javaColecoes = new Curso("Dominando as colecoes do Java","Paulo Silveira");
		
		// Adiciona aulas direto do construtor
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));

		// Cria uma lista com os nomes das aulas do objeto Curso
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		// Imprime no console a lista de aulas
		System.out.println(aulasImutaveis);
		
		// Construtor das coleções que recebe o próprio tipo, para construir
		// um igual, como se fosse um clone. Permite ordenarmos a lista, sem
		// os atributos da classse
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		// Ordena a lista
		Collections.sort(aulas);
		// Imprime no console a lista ordenada
		System.out.println(aulas);
		// Imprime no console o tempo total de minutos
		System.out.println(javaColecoes.getTempoTotal());
		// Imprime no console os cursos
		System.out.println(javaColecoes);
	}
}
