package br.com.alura.java.io.teste;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");
		
		// Verifica se existe uma linha para ser buscada. Retorna um boolean
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine(); // Busca a pr�xima linha. Retorna uma String
		
			System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US); // Define a regra de pontua��o no padr�o americano
			linhaScanner.useDelimiter(","); // Define um crit�rio de separa��o das informa��es. No caso, a v�rgula.
			
			// Verifica se existe um pr�ximo item para ser buscado.
			String tipoConta = linhaScanner.next(); // Retorna uma String
			int agencia = linhaScanner.nextInt(); // Faz a convers�o para int
			int nConta = linhaScanner.nextInt(); // Faz a convers�o para int
			String titular = linhaScanner.next(); // Retorna uma String
			double saldo = linhaScanner.nextDouble(); // Faz a convers�o para double
			
			// Define as regras de formata��o
			String formatacao = String.format(new Locale("pt", "BR"), "%s, %04d-%08d, %20s: %08.2f %n", tipoConta, agencia, nConta, titular, saldo);
			System.out.println(formatacao);
			
			// Fecha o linhaScanner
			linhaScanner.close();
		}
		
		// Fecha o Scanner
		scanner.close();
	}
}
