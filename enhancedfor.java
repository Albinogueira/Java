public class enhancedfor {
	public static void main(String args[]) {
		int[] list={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum=sumListEnhanced(list);
		System.out.println("Soma dos elementos da lista: "+sum);
		System.out.println("Lista original");
		printList(list);
		System.out.println("Acrescentando um");
		addOne(list);
		System.out.println("Lista apos adicionar um numero");
		printList(list);
		System.out.println("Adicionando um erro");
		addOneError(list);
		System.out.println("Lista apos acrescetado o erro. Os elementos da lista nao mudou.");
		printList(list);
	}
/*	
    // pre: list != null
    // post: return sum of elements
    // uses enhanced for loop*/
	public static int sumListEnhanced(int[] list) {
		int total=0;
		for (int val:list) {
			total+=val;
		}
		return total;
	}
/*	
    // pre: list != null
    // post: return sum of elements
    // use traditional for loop*/
	public static int sumListOld(int[] list) {
		int total=0;
		for (int i=0; i<list.length;i++) {
			total+=list[i];
			System.out.println(list[i]);
		}
		return total;
	}
/*	
    // pre: list != null
    // post: none.
    // The code appears to add one to every element in the list, but does not*/
	public static void addOneError(int[] list) {
		for (int val : list) {
			val=val+1;
		}
	}
/*
    // pre: list != null
    // post: adds one to every element of list*/
	public static void addOne(int[] list) {
		for (int i=0;i<list.length;i++) {
			list[i]++;
		}
	}
	public static void printList(int [] list) {
		for (int i=0;i<list.length;i++) {
			System.out.println(i+", "+list[i]);
		}
	}
}

/*
Output:

Sum of elements in list: 55
Original List
index, value
0, 1
1, 2
2, 3
3, 4
4, 5
5, 6
6, 7
7, 8
8, 9
9, 10
Calling addOne
List after call to addOne
index, value
0, 2
1, 3
2, 4
3, 5
4, 6
5, 7
6, 8
7, 9
8, 10
9, 11
Calling addOneError
List after call to addOneError. Note elements of list did not change.
index, value
0, 2
1, 3
2, 4
3, 5
4, 6
5, 7
6, 8
7, 9
8, 10*/
