public class switchcase {
	public static void main(String arga[]) {
		int choice=5;
		switch(choice) {
			case 0:
				System.out.println("byte");
				System.out.println("8 bit");
				break;
			case 1:
				System.out.println("short");
				System.out.println("16 bit");
				break;
			case 2:
				System.out.println("int");
				System.out.println("32 bit");
				break;
			case 3:
				System.out.println("long");
				System.out.println("64 bit");
				break;
			case 4:
				System.out.println("float");
				System.out.println("32 bit");
				break;
			case 5:
				System.out.println("double");
				System.out.println("64 bit");
				break;
			case 6:
				System.out.println("boolean");
				System.out.println("1 bit : true/false");
				break;
			case 7:
				System.out.println("char");
				System.out.println("16 bit");
				break;
			default:
				System.out.println("Outra entrada");
				break;
		}
	}
}