import java.util.Scanner;
public class addtwomatrix {
	public static void main(String args[]) {
		int m,n,c,d;
		Scanner in=new Scanner(System.in);
		System.out.println("Entre com o número de linhas e colunas da matriz");
		m=in.nextInt();
		n=in.nextInt();
		int first[][]=new int[m][n];
		int second[][]=new int[m][n];
		int sum[][]=new int [m][n];
		System.out.println("Entre com os elementos da primeira matriz");
		for (c=0;c<m;c++)
			for (d=0;d<n;d++)
			first[c][d]=in.nextInt();
		System.out.println("Entre com os elementos da segunda matriz");
		for (c=0;c<m;c++)
			for (d=0;d<n;d++)
			second[c][d]=in.nextInt();
		for (c=0;c<m;c++)
			for (d=0;d<n;d++)
				sum[c][d]=first[c][d]+second[c][d]; //substituir '+' com '-' para subtrair matrizes
		System.out.println("suma das matrizes adicionadas");
		for (c=0;c<m;c++) {
			for (d=0;d<n;d++)
				System.out.println(sum[c][d]+"\t");
			System.out.println();
		}
	}
}


/*Output:

Enter the number of rows and columns of matrix
2  2
Enter the elements of first matrix
1  2
3  4
Enter the elements of second matrix
4  3
2  1
Sum of entered matrices :-
5    5
5    5
*/
