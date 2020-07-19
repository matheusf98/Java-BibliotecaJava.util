package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorContas;

public class Teste {

	public static void main(String[] args) {
		
		GuardadorContas guardador = new GuardadorContas();
		
		Conta c1 = new ContaCorrente(5623, 12356);
		Conta c2 = new ContaCorrente(2365, 15632);
		Conta c3 = new ContaCorrente(2365, 15632);
		
		guardador.Adicionar(c1);
		guardador.Adicionar(c2);
		guardador.Adicionar(c3);
		
		int elemento = guardador.QuantidadeElementos();
		System.out.println(elemento);

		Conta ref = (Conta) guardador.Referencias(0);
		System.out.println(ref);
	}

}
