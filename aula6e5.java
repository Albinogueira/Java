package Facul;

import java.util.Scanner;
public class aula6e5 { //menu
	public static void main(String arga[]) {
		int var;
		Scanner ent=new Scanner(System.in);
		System.out.println("Digite uma opcao:\n1 - Cadastrar Cliente\n2 - Editar Cliente\n3 - Excluir Cliente\n4 - Alterar Cliente\n5 - Sair");
		var=ent.nextInt();
		switch (var) {
			case 1 : 
				System.out.println ("Cadastrar Cliente");
				break;
			case 2 : 
				System.out.println ("Editar Cliente");
				break;
			case 3 : 
				System.out.println ("Excluir Cliente");
				break;
			case 4 : 
				System.out.println ("Alterar Cliente");
				break;
			case 5 : 
				System.out.println ("Sair");
				break;
			default  : 
			System.out.println ("Opcao Invalida!!");
		}
		
	}
}
