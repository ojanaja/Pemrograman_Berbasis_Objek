package inheritance_metode_pembayaran;

public class metodePembayaranApp {
    public static void main(String[] args) {
        kartuDebit M1 = new kartuDebit("Fauzan", 1000000, "BRI", "1234567890");
        M1.prosesPembayaran(500000);

        kartuKredit M2 = new kartuKredit("Fauzan", 1000000, "1234567890");
        M2.prosesPembayaran(500000);
    }
}