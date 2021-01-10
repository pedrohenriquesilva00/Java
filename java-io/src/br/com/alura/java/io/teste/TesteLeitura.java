package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		
		// Fluxo de Entrada com Arquivo
		
		// Criando o fluxo concreto com arquivo, mas binário
		FileInputStream fis = new FileInputStream("juventus.txt");
		// Melhorando os dados binários para caracteres
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		// Fará a leitura linha por linha do arquivo
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		
		while(linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		br.close();
	}
}
