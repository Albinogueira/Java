/* CallingMethodsInSameClass.java
 *
 * illustrates how to call static methods a class
 * from a method in the same class
 */
public class callingmethods {
	public static void main(String args[]) {
		printone();
		printone();
		printtwo();
	}
	public static void printone() {
		System.out.println("Ola mundo");
	}
	public static void printtwo() {
		printone();
		printone();
	}
}
/*
Output:
Hello World
Hello World
Hello World
Hello World*/
