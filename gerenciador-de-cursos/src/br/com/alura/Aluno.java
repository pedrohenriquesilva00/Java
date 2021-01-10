package br.com.alura;

public class Aluno {
	
	// Atributos da classe
	private String nome;
	private int numeroMatricula;
	
	// Construtor
	public Aluno(String nome, int numeroMatricula) {
		if(nome == null) {
			throw new NullPointerException("Não pode ser nulo");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	// Lista os nomes dos alunos
	public String getNome() {
		return nome;
	}

	// Lista o número de matricula
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	// Método sobreescrito da Classe Mãe
	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatricula + "]";
	}
	
	// Método sobreescrito da Classe Mãe
	@Override
	public boolean equals(Object obj) {
		Aluno outroAluno = (Aluno) obj;
		// Verifica se é igual pelo nome
		return this.nome.equals(outroAluno.nome);
	}
	
	// Método sobreescrito da Classe Mãe
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
}
