package Facul;

import javax.swing.*;
  public class exercicio3 {
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
