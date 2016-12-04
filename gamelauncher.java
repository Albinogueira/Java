class player {
	int number=0; // onde entra o palpite
	public void guess() {
		number=(int) (Math.random() *10);
		System.out.println("Estou pensando em "+number);
	}
}
public class gamelauncher {
	public static void main(String arga[]) {
		guessgame game=new guessgame();
		game.startgame();
	}
}
