package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopia {

	public static void main(String[] args) throws IOException {	
		
		// Entrada
		InputStream is = new FileInputStream("juventus.txt"); // Teclado: System.in;
		Reader r = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(r);
		
		// Saída
		OutputStream os = new FileOutputStream("juventus02.txt"); // Console: System.out;
		Writer w = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(w);
		
		String linha = br.readLine();
		
		while(linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			linha = br.readLine();
		}
		
		br.close();
		bw.close();
	}
}
