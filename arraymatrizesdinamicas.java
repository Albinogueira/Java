public class arraymatrizesdinamicas {
	public static void main(String arga[]) {
		int i,j,k=10,a[][]=new int[3][3];
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				a[i][j]=k;
				k=k+10;
				System.out.print(" "+a[i][j]);
			}
			System.out.println("");
		}
	}
}
