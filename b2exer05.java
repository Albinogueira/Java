package Facul;

/*Desenvolva um algoritmo que receba dois números inteiros, verifique qual é o maior 
entre eles, calcule e mostre o resultado da somatória dos números ímpares compreendidos entre
 esses dois números.*/
 import javax.swing.*;
 public class b2exer05 {
	public static void main(String arga[]) {
		int num,num2,mior;
		num=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número inteiro"));
		num2=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número inteiro"));
		mior=maior(num,num2);
		JOptionPane.showMessageDialog(null,"O número maior é: "+mior);
		somatoria(num,num2);
	}
	static void somatoria(int nn1,int nn2) { // procedimento somatoria
		int nn3=0,i;
		if (nn1>nn2) {
			i=nn2;
			do{//Estrutura de Repetição
				if (i%2!=0){//Condição que verifica se o número é impar
					nn3=nn3+i;
					System.out.println("i<nn1="+nn3);
				}
				i++;
				System.out.println("i<nn1=i="+i);
			}while (i<=nn1);
		} else {
			i=nn1;
			while (i<=nn2) {
				if (i%2 !=0) {
					nn3=nn3+i;
					System.out.println("i<nn2>="+nn3);
				}
				i++;
				System.out.println("i<nn2>=i="+i);
			}
		}
		JOptionPane.showMessageDialog(null,"A somatória dos números é: "+nn3);
	}
	static int maior(int n1, int n2) { // funcao maior
		int mor;
		if (n1<n2) {
			mor=n2;
		} else {
			mor=n1;
		}
		//JOptionPane.showMessageDialog(null,"O número maior é: "+mor);
		return mor;
	}
 }
