package br.com.bytebank.banco.teste.util;

import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		// Generics
		List<Conta> lista = new LinkedList<>();
		
		Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);
        
        for(Conta conta : lista) {
        	System.out.println(conta);
        }
	}
}
