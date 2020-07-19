package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.GuardadorContas;

public class TesteReferencias {

	public static void main(String[] args) {
		
		Conta[] conta = new Conta[5];
		
		ContaPoupanca cc1 = new ContaPoupanca(7152, 256555);
		ContaCorrente cc2 = new ContaCorrente(5623, 112565);
		
		conta[0] = cc1;
		conta[1] = cc2;
		
		ContaPoupanca ref = (ContaPoupanca) conta[0]; //type cast
		
		System.out.println(cc1.getNumero());
		System.out.println(ref);
		

	}

}
