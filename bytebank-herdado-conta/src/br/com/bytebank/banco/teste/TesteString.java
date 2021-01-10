package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String nome1 = "Alura";
		
		// Verifica se uma String possui uma sub-String
		System.out.println(nome1.contains("Al"));
		
		// Altera um ou mais caracteres
		String nome2 = nome1.replace("A", "a");
		System.out.println(nome2);
		
		// Altera o valor da vari�vel para ma�usculo
		String nome3 = nome1.toUpperCase();
		System.out.println(nome3);
		
		// Busca a posi��o e devolve um �nico caractere
		char a = nome1.charAt(3);
	    System.out.println(a);
	    
	    // Busca o caractere e devolve a posi��o
	    int position = nome1.indexOf("A");
	 	System.out.println(position);
	 	
	 	// Devolve o tamanho da String
	 	System.out.println(nome1.length());
	 	
	 	// Imprimi o nome Alura, letra por letra
	 	for(int i = 0; i < nome1.length(); i++ ) {
			System.out.println(nome1.charAt(i));
		}
	 	
	 	String vazio = "     Alura     ";
	 	
	 	// Busca se a String est� vazia
	 	System.out.println(vazio.isEmpty());		
		
		// Tira todos os espa�os
		String outroVazio = vazio.trim();
		System.out.println(vazio);
		System.out.println(outroVazio);		
	}
}
