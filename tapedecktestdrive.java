class tapedeck {
	boolean canrecord = false;
	void playtape() {
		System.out.println("Tape playing");
	}
	void recordtape() {
		System.out.println("Tape recording");
	}
}
class tapedecktestdrive {
	public static void main(String arga[]) {
		tapedeck t=new tapedeck();
		t.canrecord=true;
		t.playtape();
		if (t.canrecord==true) {
			t.recordtape();
		}
	}
}
