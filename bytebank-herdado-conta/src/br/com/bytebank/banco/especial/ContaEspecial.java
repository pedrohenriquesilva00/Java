package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Conta;

public class ContaEspecial extends Conta {

	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub
		super.saldo += valor;
	}

	@Override
	public int compareTo(Conta o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
