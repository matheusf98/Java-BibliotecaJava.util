package br.com.bytebank.banco.testUtil;

import java.util.ArrayList;

public class testInteger {

	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		int idade1 = 36;
		int idade2 = 56;
		int idade3 = 18;
		int idade4 = 10;
		
		lista.add(idade1);
		lista.add(idade2);
		lista.add(idade3);
		
		int tamanho = lista.size();
		
		System.out.println(tamanho);
	}

}
