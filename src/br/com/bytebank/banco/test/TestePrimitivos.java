package br.com.bytebank.banco.test;

public class TestePrimitivos {

	public static void main(String[] args) {
		
		int[] valor = new int[5];
		
		valor[0] = 29;
		valor[1] = 25;
		valor[2] = 100;
		valor[3] = 1;
		valor[4] = 58;
		
		System.out.println(valor.length);
		
		for(int i = 0; i < valor.length; i++) {
			System.out.println("Array posição " + i + " = " + valor[i]);
		}
		
	}
}
