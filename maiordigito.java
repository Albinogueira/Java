public class maiordigito {
	public static void main(String arga[]) {
		int i=695,temp=0;
		while (i> 0) {
			int r=i%10;
			i=i/10;
			if (temp < r) {
				temp=r;
			}
		}
		System.out.println(temp);
	}
}
