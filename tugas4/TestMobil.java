class TestMobil {
	public static void main(String[] args) {
		Mobil jazz = new Mobil();
		Mobil avanza = new Mobil("avanza","hitam",300,"N 1234 NN","garasi",20);
		
		System.out.print("Sebuah mobil merek "+jazz.getMerek()); 
		System.out.print(" berwarna "+jazz.getWarna());
		System.out.print(" mempunyai mesin "+jazz.getMesin()+("cc")); 
		System.out.print(" nopol "+jazz.getNopol());
		jazz.Ngebut();
		System.out.print(" di "+jazz.getPosisi()); 
		System.out.print(" dengan kecepatan "+jazz.getKecepatan() +"km/jam");

		System.out.println("\n");

		System.out.print("Sebuah mobil bermerek "+avanza.getMerek());
		System.out.print(" berwarna "+avanza.getWarna());
		System.out.print(" dengan mesin " +avanza.getMesin()+("cc"));
		System.out.print(" berplat nomor " +avanza.getNopol());
		avanza.Berhenti();
		System.out.print(" berhenti di " +avanza.getPosisi() +".");
		System.out.print(" Kecepatannya bisa mencapai " +avanza.getKecepatan() +"km/jam");

	}
}