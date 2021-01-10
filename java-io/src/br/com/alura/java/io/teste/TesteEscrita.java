package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {	
		
		// Fluxo de Entrada com Arquivo
		OutputStream os = new FileOutputStream("spfc.txt");
		Writer w = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(w);
		
		bw.write("S�o Paulo Futebol Clube � uma associa��o esportiva brasileira da cidade de S�o Paulo, capital do estado hom�nimo.");
		bw.newLine();
		bw.write("T�cnico: Fernando Diniz");
		
		bw.close();
	}
}
