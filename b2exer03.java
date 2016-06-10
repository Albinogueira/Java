package Facul;

/*3.	Desenvolva um algoritmo que receba um número N, calcule e mostre o valor da seguinte série: Série = 1 + 1/2 + 1/3 + ... + 1/N.*/
import javax.swing.*;
  public class b2exer03 {
	public static void main(String[] args) {
		int num;
	  num=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
    serie(num);  
	}
	 static void serie (int n){ 
		double seri=1;
	  
	  for(int i=1;i<=n;i++){
		     
	    seri+=   (1.0/ i) ;    
	  }
	  
	  JOptionPane.showMessageDialog(null, seri);
	  
	}

}
