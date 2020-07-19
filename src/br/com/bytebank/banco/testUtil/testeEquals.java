package br.com.bytebank.banco.testUtil;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class testeEquals {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		ContaPoupanca cc1 = new ContaPoupanca(7152, 256555);
		lista.add(cc1);
		ContaCorrente cc2 = new ContaCorrente(5623, 112565);
		lista.add(cc2);
		ContaPoupanca cc3 = new ContaPoupanca(7152, 256555);
		
		boolean contem = lista.contains(cc3);
		
		System.out.println(contem);
		
		for(Object lis : lista) {
			System.out.println(lis);
		}
		
	}

}
