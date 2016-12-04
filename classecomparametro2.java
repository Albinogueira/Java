public class classecomparametro2 {
	public static void main(String arga[]) {
		a4 ob1 = new a4();
		//mostra tipo 1
		double ans=ob1.fatorial(5);
		System.out.println(ans);
	}
}
class a4 {
	double fatorial(int a) {
		double fat=1;
		for(int i=1;i<=a;i++) {
			fat*=i;
		}
		System.out.println("Com o uso do return, com argumento");
		System.out.println("Recebido: int var= "+a);
		return fat;
	}
}
