/**
 * Created by F A I Z A L on 6/11/2015.
 */
public class TestClass {

    public static void main(String[] args) {

        Musisi iwanFals = new Musisi("Iwan Fals","Jakarta",'L',55);
        Musisi ahmadDhani = new Musisi("Ahmad Dhani","Surabaya",'L',43);

        System.out.println("MUSISI LEGENDARIS");
        System.out.println("\n");
        System.out.println("Nama : " +iwanFals.getNamaMusisi());
        System.out.println("Alamat : " +iwanFals.getAlamatMusisi());
        System.out.println("Jenis Kelamin : " +iwanFals.getJenisKelaminMusisi());
        System.out.println("Umur : " +iwanFals.getUmurMusisi());
        System.out.println("\n");
        System.out.println("Nama : " + ahmadDhani.getNamaMusisi());
        System.out.println("Alamat : " + ahmadDhani.getAlamatMusisi());
        System.out.println("Jenis Kelamin : " + ahmadDhani.getJenisKelaminMusisi());
        System.out.println("Umur : " + ahmadDhani.getUmurMusisi());

        System.out.println("\n");

        Lagu oemarBakrie = new Lagu("Oemar Bakrie",iwanFals,"Iwan Fals",1960);
        Lagu laskarCinta = new Lagu("Laskar Cinta",ahmadDhani,"Dhani & Once",2006);

        System.out.println("Musisi tersebut menciptakan lagu antara lain : ");
        System.out.println("\n");
        System.out.println("Judul : " +oemarBakrie.getJudulLagu());
        System.out.println("Pencipta : " +oemarBakrie.getCreatedBy());
        System.out.println("Penyanyi : " +oemarBakrie.getPenyanyiLagu());
        System.out.println("Tahun : " +oemarBakrie.getTahunPembuatan());
        System.out.println("\n");
        System.out.println("Judul : " +laskarCinta.getJudulLagu());
        System.out.println("Pencipta : " +laskarCinta.getCreatedBy());
        System.out.println("Penyanyi : " +laskarCinta.getPenyanyiLagu());
        System.out.println("Tahun : " +laskarCinta.getTahunPembuatan());


    }
}
