//class
class Tabungan {
//instance variabel
	private String nama;
	private int rekening;
	private int saldo;
	private int bunga;

	public Tabungan(){
		nama = "Faizal";
		rekening = 1441180178;
		saldo = 100000;
		bunga = 1;
	}
	public Tabungan(String namaInput, int rekeningInput){
		nama = namaInput;
		rekening = rekeningInput;
	}
	public Tabungan(String namaInput, int rekeningInput, int saldoInput){
		nama = namaInput;
		rekening = rekeningInput;
		saldo = saldoInput;
	}
	public Tabungan(String namaInput, int rekeningInput, int saldoInput, int bungaInput){
		nama = namaInput;
		rekening = rekeningInput;
		saldo = saldoInput;
		bunga = bungaInput;	
	}
	public void Menabung(){
		System.out.println("Anda telah menabung uang sebesar " +saldo);
	}
	public void Mengambil(){
		System.out.println("Anda telah mengambil uang sebesar "+saldo);
	}
	public void Transfer(){
		System.out.println("Anda telah menransfer uang sebesar "+saldo);
	}
	public void Menerima(){
		System.out.println("Anda telah menerima uang sebsar "+saldo);
	}
	public void Saldo(){
		System.out.println("Saldo anda sebesar "+saldo);
	}
	public void Bunga(){
		System.out.println("Anda mendapat bunga sebesar "+bunga+("%"));
	}
//getter dan setter
	public String getNama(){
		return nama;
	}	
	public String setNama(String p){
		return nama = p;
	}
	public int getRekening(){
		return rekening;
	}
	public int setRekening(int r){
		return rekening = r;
	}
	public int getSaldo(){
		return saldo;
	}
	public int setSaldo(int s){
		return saldo = s;
	}
	public int getBunga(){
		return bunga;
	}
	public int setBunga(int b){
		return bunga = b;
	}

}