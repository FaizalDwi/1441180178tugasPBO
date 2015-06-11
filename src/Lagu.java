/**
 * Created by F A I Z A L on 6/11/2015.
 */
public class Lagu {

    private String judulLagu;
    private Musisi createdBy;
    private String penyanyiLagu;
    private int tahunPembuatan;


    public Lagu(String judulLagu, Musisi createdBy, String penyanyiLagu) {
        this.judulLagu = judulLagu;
        this.createdBy = createdBy;
        this.penyanyiLagu = penyanyiLagu;
    }

    public Lagu(String judulLagu, Musisi createdBy, String penyanyiLagu, int tahunPembuatan) {
        this.judulLagu = judulLagu;
        this.createdBy = createdBy;
        this.penyanyiLagu = penyanyiLagu;
        this.tahunPembuatan = tahunPembuatan;
    }

    public String getJudulLagu() {
        return judulLagu;
    }

    public void setJudulLagu(String judulLagu) {
        this.judulLagu = judulLagu;
    }

    public Musisi getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Musisi createdBy) {
        this.createdBy = createdBy;
    }

    public String getPenyanyiLagu() {
        return penyanyiLagu;
    }

    public void setPenyanyiLagu(String penyanyiLagu) {
        this.penyanyiLagu = penyanyiLagu;
    }

    public Number getTahunPembuatan() {
        return tahunPembuatan;
    }

    public void setTahunPembuatan(int tahunPembuatan) {
        this.tahunPembuatan = tahunPembuatan;
    }

    @Override
    public String toString() {
        return "Lagu{" +
                "judulLagu='" + judulLagu + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", penyanyiLagu='" + penyanyiLagu + '\'' +
                ", tahunPembuatan=" + tahunPembuatan +
                '}';
    }
}
