public class foravancado {
	public static void main(String arga[]) {
		String s1="INDIA";
		char s2[]=new char[s1.length()];
		for (int i=0;i<s1.length();i++) {
			s2[i]=s1.charAt(i);
		}
		for (char e: s2) {
			System.out.println(e);
		}
	}
}
