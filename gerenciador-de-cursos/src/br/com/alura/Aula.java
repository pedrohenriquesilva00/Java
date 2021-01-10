package br.com.alura;

public class Aula implements Comparable<Aula> {

	// Atributos da Classe
	private String titulo;
	private int tempo;
	
	// Construtor
	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	// Busca os nomes das Aulas
	public String getTitulo() {
		return titulo;
	}
	
	// Busca o tempo das aulas
	public int getTempo() {
		return tempo;
	}
	
	// Método sobreescrito da Classe Mãe
	@Override
	public String toString() {
		
		return "Aula: " + this.titulo + ", " + this.tempo + " minutos";
	}

	// Ordena a lista
	@Override
	public int compareTo(Aula outraAula) {
		// Compara um titulo com outro
		return this.titulo.compareTo(outraAula.titulo);
	}
}
