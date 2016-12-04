public class guessgame {
	// cria tres variaveis de instancia para os tres objetos player
	player p1;
	player p2;
	player p3;
	
	public void startgame() {
		// cria tres objetos player e atribui a eles as tres variaveis de instancia player
		p1=new player();
		p2=new player();
		p3=new player();
		// declara tres variaveis para armazenar os tres palpites que os jogadores fornecerao
		int guessp1=0;
		int guessp2=0;
		int guessp3=0;
		// declara tres variaveis para armazenar um valor verdadeiro ou falso baseado na resposta do jogador
		boolean p1isRight=false;
		boolean p2isRight=false;
		boolean p3isRight=false;
		
		int targetnumber=(int) (Math.random() * 10); // cria um número alvo que os jogadores terao que adivinhar
		System.out.println("Estou pensando em um número entre 0 e 9...");
		while (true) {
			System.out.println("O número a adivinhar é "+ targetnumber);
			// chama o metodo guess() de cada jogador
			p1.guess();
			p2.guess();
			p3.guess();
			// obtem o palpite de cada jogador(o resultado da execucao de seu metodo guess()) acessando a variavel numerica de cada um
			guessp1=p1.number;
			System.out.println("O jogador um forneceu o palpite "+guessp1);
			guessp2=p2.number;
			System.out.println("O jogador dois forneceu o palpite "+guessp2);
			guessp3=p3.number;
			System.out.println("O jogador tres forneceu o palpite "+guessp3);
			// verifica o palpite de cada jogador para ver se é igual ao numero alvo.
			// se um jogador acertar, sua variavel sera configurada com true (lembre-se de que configuramos false como padrao)
			if (guessp1==targetnumber) {
				p1isRight=true;
			}
			if (guessp2==targetnumber) {
				p2isRight=true;
			}
			if (guessp3==targetnumber) {
				p3isRight=true;
			}
			// se o jogador um ou o jogador dois ou o jogador tres acertar...(o operador || significa ou)
			if (p1isRight || p2isRight || p3isRight) {
				System.out.println("Temos um vencedor!");
				System.out.println("O jogador um acertou? "+p1isRight);
				System.out.println("O jogador dois acertou? "+p2isRight);
				System.out.println("O jogador tres acertou? "+p3isRight);
				System.out.println("Fim de jogo.");
				break; // fim do jogo, portanto saia do loop
			} else { // caso contrario, fique no loop e peca aos jogadores outro palpite
				// devemos continuar porque ninguem acertou"
				System.out.println("Os jogadores terão que tentar novamente.");
			} // fim do if/else
		} // fim do loop
	} // fim do metodo
} // fim da classe
