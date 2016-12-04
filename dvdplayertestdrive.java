class dvdplayer {
	boolean canrecord=false;
	void recorddvd() {
		System.out.println("DVD recording");
	}
	void playdvd() {
		System.out.println("DVD playing");
	}
}
class dvdplayertestdrive {
	public static void main(String arga[]) {
		dvdplayer d= new dvdplayer();
		d.canrecord=true;
		d.playdvd();
		if (d.canrecord==true) {
			d.recorddvd();
		}
	}
}
