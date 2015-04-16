class Mobil {
	private String merek;
	private String warna;
	private int mesin;
	private String nopol;
	private String posisi;
	private int kecepatan;

	public Mobil(){
		merek = "jazz";
		warna = "merah";
		mesin = 300;
		nopol = "W 5808 TF";
		posisi = "jalan raya";
		kecepatan = 30;
	}
	public Mobil(String merekInput, String warnaInput, int mesinInput, String nopolInput, String posisiInput, int kecepatanInput){
		merek = merekInput;
		warna = warnaInput;
		mesin = mesinInput;
		nopol = nopolInput;
		posisi = posisiInput;
		kecepatan = kecepatanInput;
	}
	public void Maju(){

	}
	public void Mundur(){

	}
	public void Berhenti(){

	}
	public void Belok(){

	}
	public void Ngebut(){

	}
	public void Ngerem(){

	}

	public String getMerek(){
		return merek;
	}
	public String setMerek(String m){
		return merek = m;
	}
	public String getWarna(){
		return warna;
	}
	public String setWarna(String w){
		return warna = w;
	}
	public int getMesin(){
		return mesin;
	}
	public int setMesin(int n){
		return mesin = n;
	}
	public String getNopol(){
		return nopol;
	}
	public String setNopol(String l){
		return nopol = l;
	}
	public String getPosisi(){
		return posisi;
	}
	public String setPosisi(String p){
		return posisi = p;
	}
	public int getKecepatan(){
		return kecepatan;
	}
	public int setKecepatan(int k){
		return kecepatan = k;
	}
}