public class forifpadrao {
	public static void main(String arga[]) {
		int i,j;
		for (i=1;i<=5;i++) {
			for (j=1;j<=i;j++) {
				if (i==1 || i==5 || j==1 || j==5) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
				if (j==5) {
					System.out.println();
				}
			}
		}
	}
}
