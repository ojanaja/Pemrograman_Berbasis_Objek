package abstract_metode_pembayaran;

public abstract class metodePembayaran {
    protected String nama;
    protected double saldo;

    public metodePembayaran (String nama, double saldo){
        this.nama = nama;
        this.saldo = saldo;
    }

    public abstract boolean prosesPembayaran (double jumlah);
}
