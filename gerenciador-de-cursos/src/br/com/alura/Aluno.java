package br.com.alura;

public class Aluno {
	
	// Atributos da classe
	private String nome;
	private int numeroMatricula;
	
	// Construtor
	public Aluno(String nome, int numeroMatricula) {
		if(nome == null) {
			throw new NullPointerException("N�o pode ser nulo");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	// Lista os nomes dos alunos
	public String getNome() {
		return nome;
	}

	// Lista o n�mero de matricula
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	// M�todo sobreescrito da Classe M�e
	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatricula + "]";
	}
	
	// M�todo sobreescrito da Classe M�e
	@Override
	public boolean equals(Object obj) {
		Aluno outroAluno = (Aluno) obj;
		// Verifica se � igual pelo nome
		return this.nome.equals(outroAluno.nome);
	}
	
	// M�todo sobreescrito da Classe M�e
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
}
