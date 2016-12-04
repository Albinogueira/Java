public class somapareimpar {
	public static void main(String arga[]) {
		int i,par=0,impar=0;
		for (i=0;i<=10;i++) {
			if (i%2==0) {
				par+=i;
			} else {
				impar+=i;
			}
		}
		System.out.println("A soma dos pares é: "+par);
		System.out.println("A soma dos impares é: "+impar);
	}
}
