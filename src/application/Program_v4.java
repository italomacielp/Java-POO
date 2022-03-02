package application;

import entities.Client;

public class Program_v4 {

	public static void main(String[] args) {
		
	Client c1 = new Client("Maria", "maria@gmail.com");
	Client c2 = new Client("Bob", "bob@gmail.com");
	
	String s1 = "Test";
	String s2 = "Test";
	
	//Compara pelo conte�do
	System.out.println(c1.equals(c2));
	//Compara pela refer�ncia na mem�ria, como s�o dois objetos diferentes e ser�o alocados em partes distintas da mem�ria o resultado retornar� falso.
	System.out.println(c1 == c2);
	System.out.println(c1.hashCode());
	System.out.println(c2.hashCode());
	//Compilador d� tratamento especial para literais, logo retornar� verdadeiro. Sem tratamento especial quando vc instancia um novo objeto
	System.out.println(s1 == s2);
	}
	
}
