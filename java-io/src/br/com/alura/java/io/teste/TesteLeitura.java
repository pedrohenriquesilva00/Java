package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		
		// Fluxo de Entrada com Arquivo
		
		// Criando o fluxo concreto com arquivo, mas bin�rio
		FileInputStream fis = new FileInputStream("juventus.txt");
		// Melhorando os dados bin�rios para caracteres
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		// Far� a leitura linha por linha do arquivo
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		
		while(linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		br.close();
	}
}
