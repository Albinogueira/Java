public class movietestdrive {
	public static void main(String arga[]) {
		movie one = new movie();
		one.title="Gone with the Stock";
		one.genre="Tragic";
		one.rating=-2;
		movie two= new movie();
		two.title="Lost in Cubicle Space";
		two.genre="Comedy";
		two.rating=5;
		two.playit();
		movie three=new movie();
		three.title="Byte Club";
		three.genre="Tragic but ultimately uplifting";
		three.rating=127;
	}
}
