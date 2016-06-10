package Facul;

public class aula7e2 { // divisiveis por 2 e 3
	public static void main(String arga[]) {
		for(int i=0;i<=1000;i++) {
			if ((i%2==0) && (i%3==0)) {
				System.out.println(i);
			}
		}
	}
}
