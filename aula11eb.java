package Facul;

/*Desenvolva um programa em Java que leia 10 números inteiros digitados e guarde na 
primeira coluna de uma matriz de 2 colunas, onde o elemento da segunda coluna deverá 
ser o valor da primeira coluna multiplicado por 10. No final mostrar os números da matriz 
e informar quantas linhas e quantas colunas tem a matriz.*/
import javax.swing.*;
public class aula11eb {
	public static void main(String arga[]) {
		int [][] num=new int[10][2];
		int jj=0,ii=0;
		for (int i=0;i<num.length;i++) {
			num[i][0]=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite os números inteiros"));
			num[i][1]=num[i][0]*10;
		}
		String total="";
		for (int i=0;i<num.length;i++) {
			ii=i+1;
			for (int j=0;j<num[i].length;j++) {
				jj=num[i][j];
			}
			total+=ii+" - "+jj+"\n";
		}
		JOptionPane.showMessageDialog(null,total+"\nA matriz tem: "+num.length+" linhas e: "+num[0].length+" colunas");
	}
}
