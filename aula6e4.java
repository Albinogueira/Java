package Facul;

import java.util.Scanner;
public class aula6e4 { // valor da variavel
	public static void main(String arga[]) {
		int var;
		Scanner ent=new Scanner(System.in);
		System.out.println("Digite o valor da variavel: ");
		var=ent.nextInt();
		switch (var)   {
			case 1 :
				System.out.println ("O valor da variável var é 1");
				break;
			case 2 : case 3 : case 4 : 
				System.out.println ("O valor da variável var pode ser 2, 3 ou 4");          
				break;
			case 7 : case 15 : case 25 :  
				System.out.println ("O valor da variável var pode ser 7, 15 ou 25");          
				break;
			case 8 : case 11 : case 12 : case 13 :    
				System.out.println ("O valor da variável var pode ser 8 , 11, 12 ou 13");          
				break;
			default  : 
				System.out.println ("opção inválida.");
		}
	}
}
