public class arraymediadoselementos {
	public static void main(String arga[]) {
		int i,sum=0,avg=0,a[]={10,20,30};
		for (i=0;i<a.length;i++) {
			sum+=a[i];
		}
		avg=sum/a.length;
		System.out.println(avg);
	}
}
