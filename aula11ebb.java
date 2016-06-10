package Facul;

import javax.swing.JOptionPane; 
public class aula11ebb {
	public static void main ( String args[])	{
		int numeros[][] = new int [10][2];
		int i;
		for (i=0; i<numeros.length; i++) {
			numeros[i][0]=Integer.parseInt(JOptionPane.showInputDialog("Digite o Numero " +(i+1)+":"));
			numeros[i][1]= numeros[i][0]*10;
		}
		String total="";
		for (i=0; i<numeros.length; i++) {
			total+="Numeros "+i+": " +numeros[i][0]+" e "+numeros [i][1]+"\n";
		}
		JOptionPane.showMessageDialog(null,total+"\nA matriz tem "+numeros.length+" linhas e "+numeros[0].length+" colunas");
	}
}
