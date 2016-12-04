import java.util.Scanner;
class factorial {
	public static void main(String args[]) {
		int n,c,fact=1;
		System.out.println("Insira um inteiro para calcular seu fatorial");
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		if (n<0)
			System.out.println("Numero nao e negativo.");
		else {
			for (c=1;c<=n;c++) {
				fact = fact*c;
			}
			System.out.println("Fatorial de "+n+" e = "+fact);
		}
	}
}
/*
Output:

Enter an integer to calculate it's factorial
10*/
