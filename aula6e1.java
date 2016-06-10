package Facul;

import java.util.Scanner;
public class aula6e1 { // maioridade
	public static void main(String arga[]) {
		int idade;
		Scanner ent=new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		idade=ent.nextInt();
		if (idade>=18) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de idade");
		}
		//No operador ternário, fica:
		System.out.println(idade>=18 ? "Maior de idade" : "Menor de idade");
	}
}
