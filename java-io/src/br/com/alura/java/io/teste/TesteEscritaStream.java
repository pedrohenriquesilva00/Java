package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaStream {

	public static void main(String[] args) throws IOException {
		
//		// Fluxo de Entrada com Arquivo
//		OutputStream os = new FileOutputStream("spfc.txt");
//		Writer w = new OutputStreamWriter(os);
//		BufferedWriter bw = new BufferedWriter(w);
		
		PrintStream ps = new PrintStream("spfc.txt");
		
		ps.println("São Paulo Futebol Clube");
		ps.println();
		ps.print("Tricampeão Mundial");
		
		ps.close();
	}
}
