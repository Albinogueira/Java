public class somadigitos {
	public static void main(String arga[]) {
		int i=521,sum=0;
		while (i>0) {
			int r=i%10;
			sum+=r;
			i/=10;
		}
		System.out.println(sum);
	}
}
