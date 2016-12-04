public class operadorternario {
	public static void main(String arga[]) {
		int a=43, b=56, c=64;
		int x=a>b?(a>c?a:c):(b>c?b:c);
		System.out.println("Máximo é "+x);
	}
}
