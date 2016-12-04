import java.util.Scanner;
class binarysearch {
	public static void main(String args[]) {
		int c,first,last,middle,n,search,array[];
		Scanner in=new Scanner(System.in);
		System.out.println("Entre com o numero de elementos");
		n=in.nextInt();
		array=new int[n];
		System.out.println("Entre "+n+" inteiros");
		for (c=0;c<n;c++)
			array[c]=in.nextInt();
		System.out.println("Entre com valor para procurar");
		search=in.nextInt();
		first=0;
		last=n-1;
		middle=(first+last)/2;
		while (first <=last) {
			if (array[middle] < search)
				first = middle+1;
			else if (array[middle] == search) {
				System.out.println(search+" encontrado na localizacao "+(middle+1)+".");
				break;
			}
			else
				last=middle-1;
			middle=(first+last)/2;
		}
		if (first > last)
			System.out.println(search+" nao esta presente na lista.\n");
	}
}

/*
Output:

Enter number of elements
5
Enter 5 integers
2
5
6
8
9
Enter value to find
5*/
