package Facul;

import javax.swing.*;
import java.util.Scanner;
public class ex4{
	static void tabuada (){
		Scanner ler = new Scanner(System.in);
		int i, n, res;
		System.out.printf("Informe um numero: ");
		n = ler.nextInt();
		System.out.println("Tabuada do: "  +n );
		for (i=1; i<=10; i++) {
			res = n*i; 
			System.out.println(n+ " * " +i+ " = " +res);
		}
	}
	public static void main(String[] args) {
		tabuada();
	}
}
