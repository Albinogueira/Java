public class continuestatement {
	public static void main(String arga[]) {
		for(int i=0;i<10;i++) {
			System.out.println(i);
			if (i%2==0) {
				continue;
			}
		}
		System.out.println("\n");
		label1:
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if (j>i) {
					continue label1;
				}
				System.out.print(""+(i+j)+"\t");
			}
			System.out.println();
		}
	}
}
