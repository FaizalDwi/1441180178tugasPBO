class TestLaptop {
	public static void main(String[] args) {	
	//instalasi objek
	//namaClass namaObjek = new namaKonstruktor();
	Laptop acer = new Laptop();
	Laptop asus = new Laptop("asus","coklat");
	Laptop lenovo = new Laptop("lenovo","putih","Connection");
	Laptop toshiba = new Laptop("toshiba", "hitam","No Connection",50);

	//getter
	acer.menyala();
	System.out.println("1. Merk = " + acer.getMerk()+ "Warna = "+acer.getWarna()+ "Wifi = " +acer.getWifi()+ "baterai = " +acer.getBaterai());
	acer.indikatorBaterai();
	acer.indikatorWifi();
	asus.mati();
	System.out.println("2. Merk = " + asus.getMerk()+ "Warna = "+asus.getWarna()+ "Wifi = " +asus.getWifi()+ "baterai = " +asus.getBaterai() );
	asus.indikatorBaterai();
	asus.indikatorWifi();
	asus.mati();
	lenovo.menyala();
	System.out.println("3. Merk = " + lenovo.getMerk()+ "Warna = "+lenovo.getWarna()+ "Wifi = " +lenovo.getWifi() + "baterai = " +lenovo.getBaterai() );
	lenovo.indikatorBaterai();
	lenovo.indikatorWifi();
	lenovo.mati();
	toshiba.menyala();
	System.out.println("4. Merk = " + toshiba.getMerk()+ "Warna = "+toshiba.getWarna()+ "Wifi = " +toshiba.getWifi() + "baterai = " +toshiba.getBaterai() );
	toshiba.indikatorBaterai();
	toshiba.indikatorWifi();
	toshiba.mati();

	//setter
	acer.setMerk("acer"); acer.setWarna("putih"); acer.setWifi("Connection"); acer.setBaterai(78);
	acer.menyala();
	System.out.println("1. Merk = " + acer.getMerk()+ "Warna = "+acer.getWarna()+ "Wifi = " +acer.getWifi() + "baterai = " +acer.getBaterai() );
	acer.indikatorBaterai();
	acer.indikatorWifi();
	acer.mati();
	lenovo.setWifi("Not Connected");
	lenovo.setBaterai(89);
	System.out.println("3. Merk = " + lenovo.getMerk()+ "Warna = "+lenovo.getWarna()+ "Wifi = " +lenovo.getWifi() + "baterai = " +lenovo.getBaterai() );
	lenovo.indikatorBaterai();
	lenovo.indikatorWifi();
	lenovo.mati();
	}
	
}