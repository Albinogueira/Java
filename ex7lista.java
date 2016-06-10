package Facul;

import javax.swing.*;
public class ex7lista {
	public static void main(String arga[]) {
		int n=0;
		n=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero"));
		fibo(n);
		System.out.println();
	}
	static void fibo(int gg){
		System.out.print("1,");
		int num1=1,num2=1,ncontr=1;
		for (int i=1;i<gg;i++) {
			System.out.print(ncontr+",");
			ncontr=num1+num2;
			num1=num2;
			num2=ncontr;
		}
	}
}
