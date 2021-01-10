package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		// Especif�ca que temos apenas refer�ncias do tipo Conta
		ArrayList<Conta> lista = new ArrayList<>();
		
		Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);
        
        Conta cc3 = new ContaCorrente(22, 22);
        
        // Verifica se existe uma conta e retorna um boleano
        boolean existe = lista.contains(cc3);
        
        System.out.println("J� existe? " + existe);
                
        for(Conta conta : lista) {
        	System.out.println(conta);
        }
	}
}
