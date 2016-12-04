public class arraymenornumero {
	public static void main(String arga[]) {
		int i,min,a[]={10,60,5,40,50};
		min=a[0];
		for(i=0;i<5;i++) {
			if (min>a[i]) {
				min=a[i];
			}
		}
		System.out.println(min);
	}
}
