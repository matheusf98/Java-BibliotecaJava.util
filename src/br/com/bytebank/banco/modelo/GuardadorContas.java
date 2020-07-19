package br.com.bytebank.banco.modelo;

public class GuardadorContas {
	
	private Object[] referencias;
	private int Contador;
	
	public GuardadorContas() {
		this.referencias = new Object[10];
		this.Contador = 0;
	}
	
	public void Adicionar(Object ref) {
		this.referencias[this.Contador] = ref;
		this.Contador++;
	}

	public int QuantidadeElementos() {
		return this.Contador;
		
	}

	public Object Referencias(int pos) {
		return this.referencias[pos];
	}
}
