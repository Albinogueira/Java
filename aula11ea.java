/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facul;

/**
 *
 * @author Luiz.albino
 */
import javax.swing.JOptionPane;
public class aula11ea {
    public static void main ( String args[]) {
        double A[], B[], C[];
        A = new double [5]; 
	B = new double [5];
        C = new double [5];
        String result="";
        for (int i=0; i<A.length; i++)     {
            A[i]=Double.parseDouble(JOptionPane.showInputDialog("Digite o Número Real " +(i+1)+":"));       B[i]=Double.parseDouble(JOptionPane.showInputDialog("Digite o Número Real " +(i+1)+":"));
            C[i]= dif(A[i],B[i]);
        }
        for (int i=0; i<A.length; i++)
            result+="A: "+A[i]+", B: "+B[i]+", C: "+C[i]+"\n";
            JOptionPane.showMessageDialog(null, result);   
    } // fim método main
    static double dif(double x, double y) {
        return x-y;  
    }
} // fim Classe