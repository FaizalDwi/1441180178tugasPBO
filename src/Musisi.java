/**
 * Created by F A I Z A L on 6/11/2015.
 */
public class Musisi {

    private String namaMusisi;
    private String alamatMusisi;
    private char jenisKelaminMusisi;
    private int umurMusisi;


    public Musisi(String namaMusisi, String alamatMusisi, char jenisKelaminMusisi) {
        this.namaMusisi = namaMusisi;
        this.alamatMusisi = alamatMusisi;
        this.jenisKelaminMusisi = jenisKelaminMusisi;
    }

    public Musisi(String namaMusisi, String alamatMusisi, char jenisKelaminMusisi, int umurMusisi) {
        this.namaMusisi = namaMusisi;
        this.alamatMusisi = alamatMusisi;
        this.jenisKelaminMusisi = jenisKelaminMusisi;
        this.umurMusisi = umurMusisi;
    }

    public String getNamaMusisi() {
        return namaMusisi;
    }

    public void setNamaMusisi(String namaMusisi) {
        this.namaMusisi = namaMusisi;
    }

    public String getAlamatMusisi() {
        return alamatMusisi;
    }

    public void setAlamatMusisi(String alamatMusisi) {
        this.alamatMusisi = alamatMusisi;
    }

    public char getJenisKelaminMusisi() {
        return jenisKelaminMusisi;
    }

    public void setJenisKelaminMusisi(char jenisKelaminMusisi) {
        this.jenisKelaminMusisi = jenisKelaminMusisi;
    }

    public int getUmurMusisi() {
        return umurMusisi;
    }

    public void setUmurMusisi(int umurMusisi) {
        this.umurMusisi = umurMusisi;
    }

    @Override
    public String toString() {
        return "Musisi{" +
                "namaMusisi='" + namaMusisi + '\'' +
                ", alamatMusisi='" + alamatMusisi + '\'' +
                ", jenisKelaminMusisi=" + jenisKelaminMusisi +
                ", umurMusisi=" + umurMusisi +
                '}';
    }
}
