import java.util.Scanner;
class bubblesort {
	public static void main(String []args) {
		int n,c,d,swap;
		Scanner in=new Scanner(System.in);
		System.out.println("Entre com numeros inteiros para classificar");
		n=in.nextInt();
		int array[]=new int[n];
		System.out.println("Entre "+n+" inteiros");
		for (c=0;c<n;c++)
			array[c]=in.nextInt();
		for (c=0;c<(n-1);c++) {
			for (d=0;d<n-c-1;d++) {
				if (array[d]>array[d+1]) {
					swap=array[d];
					array[d]=array[d+1];
					array[d+1]=swap;
				}
			}
		}
		System.out.println("Lista de numeros classificadas");
		for (c=0;c<n;c++)
			System.out.println(array[c]);
	}
}

/*
Output:

Input number of integers to sort
5
Enter 5 integers
5
4
3
2
1
Sorted list of numbers
1
2
3
4
5*/
