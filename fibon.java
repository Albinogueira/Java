import javax.swing.*;
public class fibon {
	public static void main(String args[]) {
		int m,n=0,t=1,x=0;
		String tudo=n+","+t+",";
		m=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número inteiro:"));
		while (x<m) {
			if (m==0) {
				JOptionPane.showMessageDialog(null,"Série Fibonacci é: 0");
				break;
			}
			if (m==1) {
				JOptionPane.showMessageDialog(null,"Série Fibonacci é: 1");
				break;
			}
			x=n+t;
			if (x>m) {
				tudo=tudo+x+".";
			} else {
			tudo=tudo+x+",";
		}
			n=t;
			t=x;
		}
		JOptionPane.showMessageDialog(null,tudo);
	}
	
/*	fibonacci fibo=new fibonacci();
	fibo.calculafibo(m);
	class fibonacci {
		int n;
		void calculafibo(n) {
			n=(n-1)+(n-2);
		}
	}
	}*/
}
