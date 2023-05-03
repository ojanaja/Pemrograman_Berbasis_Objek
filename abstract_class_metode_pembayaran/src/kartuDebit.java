package inheritance_metode_pembayaran;

public class kartuDebit extends metodePembayaran {
    private String namaBank;
    private String nomerRekening;
    private double jumlah;

    public kartuDebit (String nama, double saldo, String namaBank, String nomerRekening, double jumlah){
        super(nama, saldo);
        this.namaBank = namaBank;
        this.nomerRekening = nomerRekening;
        this.jumlah = jumlah;
    }

    @Override
    public boolean prosesPembayaran (){
        if (jumlah <= saldo){
            saldo -= jumlah;
            return true;
        } else {
            return false;
        }
    }
}
