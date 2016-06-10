package Facul;

import javax.swing.*;
public class aula8e3 { //somatoria
   public static void main(String[] args) {
     int x; 
     double y, soma=0;
     for(x = 1; x<=50; x++) {
       y = x * 2;
       soma+= x/y;     // soma = soma + x/y
     }
     JOptionPane.showMessageDialog(null, "A somatória é : "+soma);
   }
}
