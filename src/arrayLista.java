
public class arrayLista  {

	public static void main(String[] args) {
		valores[] array = new valores[5];
		valores v1 = new valores(25);
		valores v2 = new valores(5);
		valores v3 = new valores(55);
		valores v4 = new valores(21);
		valores v5 = new valores(69);
		
		array[0] = v1;
		array[1] = v2;
		array[2] = v3;
		array[3] = v4;
		array[4] = v5;
		
		System.out.println(array[4].getValor());
	}

}
