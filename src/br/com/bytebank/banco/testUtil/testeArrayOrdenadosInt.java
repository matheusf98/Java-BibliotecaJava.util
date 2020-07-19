package br.com.bytebank.banco.testUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class testeArrayOrdenadosInt {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		ContaPoupanca cc1 = new ContaPoupanca(7152, 256555);
		cc1.deposita(250.0);
		lista.add(cc1);
		ContaCorrente cc2 = new ContaCorrente(5623, 112565);
		cc2.deposita(350.0);
		lista.add(cc2);
		ContaPoupanca cc3 = new ContaPoupanca(7152, 101025);
		cc3.deposita(100.0);
		lista.add(cc3);
		ContaCorrente cc4 = new ContaCorrente(5623, 569847);
		cc4.deposita(500.0);
		lista.add(cc4);
		

		lista.sort(new Comparator<Conta>(){ //Clase Anônima

					@Override
					public int compare(Conta c1, Conta c2) {
						return Integer.compare(c1.getAgencia(), c2.getAgencia());
					}
			}
		);
		
		Collections.sort(lista);
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		
	}
}

