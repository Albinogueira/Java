package Facul;

import javax.swing.*;
public class aula8e1 { //tabuada
    public void exibe() {
    //public static void main (String arg []) {
        int num, num2;
        String tab ="Tabuada do ";         
        num = Integer.parseInt ( JOptionPane.showInputDialog (null,"Entre com um número"));
        tab=tab+num+"\n";        
        for (int i = 1; i《=10; i++) {
            num2=num*i;                 
            tab=tab+i+"*"+num+"="+num2+"\n";        
        }        
        JOptionPane.showMessageDialog (null, tab);   
    }
}                              