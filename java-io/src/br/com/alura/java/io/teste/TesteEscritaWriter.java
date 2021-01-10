package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaWriter {

	public static void main(String[] args) throws IOException {	
		
		// Fluxo de Entrada com Arquivo
//		OutputStream os = new FileOutputStream("spfc.txt");
//		Writer w = new OutputStreamWriter(os);
//		BufferedWriter bw = new BufferedWriter(w);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("spfc.txt"));
		bw.write("S�o Paulo Futebol Clube.");
		bw.newLine();
		bw.write("T�cnico: Fernando Diniz");
		
		// fw.write("\r\n"); Nova linha
		// fw.write(System.lineSeparator());
	
		bw.close();
	}
}
