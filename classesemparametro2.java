public class classesemparametro2 {
	public static void main(String arga[]) {
		a5 ob1=new a5();
		//imprime tipo 1
		double ans=ob1.getpi();
		System.out.println(ans);
		//imprime tipo 2
		System.out.println(ob1.getpi());
	}
}
class a5 {
	double getpi() {
		System.out.println("Com return, sem argumento");
		return Math.PI;
	}
}
