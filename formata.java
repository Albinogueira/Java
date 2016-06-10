package Facul;

/*String pattern = "####,####.##";
DecimalFormat decimalFormat = new DecimalFormat(pattern);

String number = decimalFormat.format(123456789.123);
System.out.println(number);*/
import javax.swing.*;
import java.text.*;
public class formata{
	public static void main (String args[]){
		double soma=0;
		String pattern = "###,###.##";
		DecimalFormat decimalFormat = new DecimalFormat(pattern);
		do {
			soma=soma+4442.266;
		} while (soma <100000);
		String number = decimalFormat.format(soma);
		JOptionPane.showMessageDialog(null, "O total de grãos é "+number);
	}
}
