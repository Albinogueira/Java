public class arraymultiplicacaodematrizes {
	public static void main(String arga[]) {
		int i,j,sum=0,a[][]=new int[2][2],b[][]=new int[2][2],c[][]=new int[2][2];
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
		b[0][0]=1;
		b[0][1]=2;
		b[1][0]=3;
		b[1][1]=4;
		for (i=0;i<2;i++) {
			for (j=0;j<2;j++){
				for (int k=0;k<2;k++) {
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		for (i=0;i<2;i++) {
			for (j=0;j<2;j++) {
				System.out.print("    "+c[i][j]);
			}
			System.out.println("    ");
		}
	}
}
