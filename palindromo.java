public class palindromo {
	public static void main(String arga[]) {
		int n=1215,sum=0,m=n;
		while (n>0) {
			int r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		if (m==sum) {
			System.out.println("Palindromo");
		} else {
			System.out.println("Não palindromo");
		}
	}
}
