class Laptop { 
	//instance variabel
	private String merk;
	private String warna;
	private String wifi;
	private int baterai;

	public Laptop(){
		merk = "TOSHIBA";
		warna = "Hitam";
		wifi = "Connected";
		baterai = 50;
	}

	public Laptop(String merkInput, String warnaInput){
		String merk = merkInput;
		String warna = warnaInput;
	}	
	public Laptop(String merkInput, String warnaInput, String wifiInput){
		String merk = merkInput;
		String warna = warnaInput;
		String wifi = wifiInput;
	}
	public Laptop(String merkInput, String warnaInput, String wifiInput, int bateraiInput){
		String merk = merkInput;
		String warna = warnaInput;
		String wifi = wifiInput;
		int baterai = bateraiInput;
	}

	public void menyala(){
		System.out.println("Welcome to Laptop");
	}
	public void mati(){
		System.out.println("Thankyou have a nice day");
	}
	public void indikatorBaterai(){
		System.out.println("Baterai tinggal : "+baterai+("%"));
	}	
	public void indikatorWifi(){
		System.out.println("Wifi : "+wifi);
	}

//getter and setter
	public String getMerk() {
		return merk;
	}
	public String getWarna() {
		return warna;
	}
	public String getWifi() {
		return wifi;
	}
	public int getBaterai() {
		return baterai;
	}
	public void setMerk(String m) {
		merk=m;
	}
	public void setWarna(String c) {
		warna=c;
	}
	public void setWifi(String w) {
		wifi=w;
	}
	public void setBaterai(int b) {
		baterai=b;
	}

}