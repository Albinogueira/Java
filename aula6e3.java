package Facul;

import java.util.Scanner;
public class aula6e3 { //valor da variavel
	public static void main(String arga[]) {
		int var;
		Scanner ent=new Scanner(System.in);
		System.out.println("Digite o valor da variavel: ");
		var=ent.nextInt();
		switch (var) {
			case 1 : 
				System.out.println ("O valor da variável var é 1");
				break;
			case 2 : 
				System.out.println ("O valor da variável var é 2");
				break;
			case 3 : 
				System.out.println ("O valor da variável var é 3");
				break;
			default  : 
			System.out.println ("O valor da variável var não é 1, 2 ou 3");
		}
		
	}
}
