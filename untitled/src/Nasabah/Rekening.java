package Nasabah;

/**
 * Created by F A I Z A L on 6/17/2015.
 */
public class Rekening {
    private Double saldoRekening;


    public Rekening(Double saldoRekening) {
        this.saldoRekening = saldoRekening;
    }



    public Double getSaldoRekening() {
        return saldoRekening;
    }

    public void setSaldoRekening(Double saldoRekening) {
        this.saldoRekening = saldoRekening;
    }

    public void tarik(double tarik){
        // untuk mengurangi nilai saldo
        this.saldoRekening = saldoRekening - tarik;

    }

    public void setor(double setor){
        // untuk menambah nilai saldo
        this.saldoRekening = saldoRekening + setor;

    }

    @Override
    public String toString() {
        return "Rekening{" +
                "saldoRekening=" + saldoRekening +
                '}';
        }
    }
