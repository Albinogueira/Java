package Facul;

import java.util.Scanner;
public class aula6e2 { // maioridade
	public static void main(String arga[]) {
		int idade;
		Scanner ent=new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		idade=ent.nextInt();
		if (idade<16) {
			System.out.println("Não pode votar nem dirigir");
		} else { 
			if (idade <18) {
   				System.out.println("Pode votar mas não pode dirigir");
			} else {
				System.out.println("Pode votar e dirigir");
			   }
		}
		//No operador ternário, fica:
		System.out.println(idade<16 ? "Não pode dirigir nem votar" : idade <18 ? "Pode votar mas não pode dirigir" : "Pode dirigir e votar");
	}
}
