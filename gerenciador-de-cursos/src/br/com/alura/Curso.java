package br.com.alura;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {
	
	// Atributos da classe
	private String nome;
	private String instrutor;
	
	// Cria uma lista genérica. Considerado boa prática não nos comprometermos
	// com uma implementação em específico
	private List<Aula> aulas = new LinkedList<Aula>();
	
	// Cria um conjunto
	private Set<Aluno> alunos = new HashSet<>();
	
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	
	// Construtor
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	// Busca o nome das aulas
	public String getNome() {
		return nome;
	}
	
	// Busca os instrutores das aulas
	public String getInstrutor() {
		return instrutor;
	}
	
	// Retorna uma lista de aulas
	public List<Aula> getAulas() {
		// Devolve uma cópia imutável da coleção de aulas e
	    // lança uma exceção caso tentem alterar essa cópia
		return Collections.unmodifiableList(aulas);
	}
	
	// Adiciona uma aula na lista
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	// Soma a quantidade de tempo dos cursos
	public int getTempoTotal() {
		
		// 1 Forma de fazer
//		int tempoTotal = 0;
//		for(Aula aula : aulas) {
//			tempoTotal += aula.getTempo();
//		}
//		return tempoTotal;
		
		// 2 Forma de fazer
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}
	
	// Método sobreescrito da Classe Mãe
	@Override
	public String toString() {
		return "[Curso: " + nome + ", tempo total: " + this.getTempoTotal() + "]";
	}

	// Adiciona os alunos no Curso
	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}
	
	// Devolve o conjunto de alunos
	public Set<Aluno> getAlunos() {
		// Devolve uma cópia imutável do conjunto de alunos e
	    // lança uma exceção caso tentem alterar essa cópia
		return Collections.unmodifiableSet(alunos);
	}

	// Verifica se um aluno está matriculado
	public boolean estaMatriculado(Aluno aluno) {
		// Verifica se existe um aluno matriculado
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int numero) {
		// Verifica se existe a chave
		if(!matriculaParaAluno.containsKey(numero))
			// Lança uma exception caso não ache
			throw new NoSuchElementException();
		// Retorna a matricula buscada
		return matriculaParaAluno.get(numero);
	}
}
