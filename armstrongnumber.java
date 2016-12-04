import java.util.*;
class armstrongnumber {
	public static void main(String args[]) {
		int n,sum=0,temp,r;
		Scanner in=new Scanner(System.in);
		System.out.println("Insira um número para verificar se ele é um número armstrong");
		n=in.nextInt();
		temp = n;
		while (temp !=0) {
			r=temp;
			sum=sum+r*r*r;
			temp=temp/10;
		}
		if (n==sum)
			System.out.println("Número digitado é um número armstrong.");
		else
			System.out.println("Número digitado não é um número armstrong.");
	}
}


/*Output:

Enter a number to check if it is an armstrong number
307
Entered number is not an armstrong number.*/
