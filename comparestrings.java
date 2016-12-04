import java.util.Scanner;
class comparestrings {
	public static void main(String args[]) {
		String s1,s2;
		Scanner in=new Scanner(System.in);
		System.out.println("Entre com o primeiro caracter");
		s1=in.nextLine();
		System.out.println("Entre com o segundo caracter");
		s2=in.nextLine();
		if (s1.compareTo(s2) > 0)
			System.out.println("Primeiro caracter e maior que o segundo.");
		else if (s1.compareTo(s2) < 0)
			System.out.println("Prineiro caracter e menor que o segundo.");
		else
			System.out.println("Os dois caracteres sao iguais.");
	}
}
/*
Output:

Enter the first string
krishna
Enter the second string
krishna*/
