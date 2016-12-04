public class breakasgoto{
	public static void main(String arga[]) {
		ablock:{
			bblock: {
				cblock: {
					System.out.println("Antes de usar break");
					if (true) {
						break bblock;
					}
					System.out.println("Esse nunca ira executar");
				}
				System.out.println("Esse nunca eh executado");
			}
			System.out.println("Esse vai ser executado");
		}
	}
}
