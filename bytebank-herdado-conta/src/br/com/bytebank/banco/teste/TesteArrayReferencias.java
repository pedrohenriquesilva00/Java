package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Conta[] contas = new Conta[5];
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		contas[0] = cc1;
		
		ContaPoupanca cp1 = new ContaPoupanca(22, 22);
		contas[1] = cp1;
		
		System.out.println(contas[1].getNumero());
		
		// type cast: Estamos avisando o compilador que vai funcionar
		ContaPoupanca ref = (ContaPoupanca) contas[1];
		
		System.out.println(cc1.getNumero());
		System.out.println(cp1.getNumero());
	}
}
