package inheritance_metode_pembayaran;

public class kartuKredit extends metodePembayaran{
    private String nomerKartu;
    private double jumlah;

    public kartuKredit (String nama, double saldo, String nomerKartu, double jumlah){
        super(nama, saldo);
        this.nomerKartu = nomerKartu;
        this.jumlah = jumlah;
    }

    @Override
    public boolean prosesPembayaran (){
        if (jumlah <= saldo){
            saldo -= jumlah;
            System.out.println("Pembayaran Berhasil!");
            return true;
        } else {
            System.out.println("Pembayaran Gagal!");
            return false;
        }
    }
}
