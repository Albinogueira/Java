public class classecomparametro {
	public static void main(String arga[]) {
		a3 ob1 = new a3();
		//chamando o metodo
		ob1.show(100);
	}
}
class a3 {
	void show(int a) {
		System.out.println("Sem o uso do return, com argumento");
		System.out.println("Argumento recebido: int var= "+a);
	}
}
