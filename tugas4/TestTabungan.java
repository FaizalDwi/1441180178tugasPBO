class TestTabungan {
	public static void main(String[] args) {
	//membuat objek
	Tabungan mandiri = new Tabungan();
	Tabungan bni = new Tabungan("herp",1441180000);
	Tabungan bri = new Tabungan("otong",1441180111,100000);
	Tabungan btn = new Tabungan("derp",1441180112,200000,2);
	System.out.println("ATM MANDIRI");
	System.out.println("\n");
	System.out.println("Nama = " +mandiri.getNama());
	System.out.println("Rekening = " +mandiri.getRekening());
	mandiri.Menabung();
	mandiri.Saldo();

	System.out.println("\n");
	
	System.out.println("ATM BNI");
	System.out.println("\n");
	System.out.println("Nama = " +bni.getNama());
	System.out.println("Rekening =" +bni.getRekening());
	bni.setSaldo(250000);
	System.out.println("Saldo anda sebesar " +bni.getSaldo());
	bni.setBunga(2);
	System.out.println("Anda mendapat bunga sebesar " +bni.getBunga()+ "%");

	System.out.println("\n");

	System.out.println("ATM BRI");
	System.out.println("\n");
	System.out.println("Nama = " +bri.getNama());
	System.out.println("Rekening = " +bri.getRekening());
	System.out.println("Saldo anda sebesar " +bri.getSaldo());

	System.out.println("\n");

	System.out.println("ATM BTN");
	System.out.println("\n");
	System.out.println("Nama = " +btn.getNama());
	System.out.println("Rekening = " +btn.getRekening());
	System.out.println("Saldo anda sebesar " +btn.getSaldo());
	System.out.println("Anda mendapat bunga sebesar " +btn.getBunga());
	bni.Mengambil();
	}
}