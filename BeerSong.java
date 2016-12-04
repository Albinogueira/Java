public class BeerSong {
		public static void main (String arga[]) {
			int beernum=99;
			String word="garrafas";
			while (beernum>0) {
				if (beernum==1) {
					word="garrafa"; //no singular, como em uma garrafa.
				}
				System.out.println(beernum+ " " + word + " de cerveja na parede.");
				System.out.println(beernum+ " " + word + " de cerveja");
				System.out.println("Assumir-se.");
				System.out.println("Passar por ai.");
				beernum=beernum-1;
				if (beernum>0) {
					System.out.println(beernum + " " + word + " de cerveja na parede.");
				} else {
					System.out.println("Não tem mais garrafas de cerveja para jogar na parede.");
				} // fim do else
			} //fim do loop while
		} // fim do metodo main
} // fim da classe
