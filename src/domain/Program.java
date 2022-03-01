package domain;

import java.util.Scanner;

import service.PrintService;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		PrintService <Integer> ps = new PrintService();
		
		System.out.println("How many values?");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}
		
		/*Abaixo se a lista for do tipo object pode levar incosistências, do tipo segurança de tipo permitindo um tipo diferente
		 * ser adicionado na lista, sendo que ela permite somente um tipo object.*/
		//ps.addValue("Maria");
		
		//Integer x = (Integer) ps.first(); 
		/*Atribuições poderiam levar inconsistências ao tipo que poderia ser solucionado
		com 'Casting'*/
		
		ps.print();
		System.out.println("First: " + ps.first());
		
		sc.close();
		
	}

}
