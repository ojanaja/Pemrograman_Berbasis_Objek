## Abstract Class

### Class Metode Pembayaran
```java
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
```
### Class Kartu Kredit
```java
package abstract_metode_pembayaran;

public class kartuKredit extends metodePembayaran{
    private String nomerKartu;

    public kartuKredit (String nama, double saldo, String nomerKartu){
        super(nama, saldo);
        this.nomerKartu = nomerKartu;
    }

    @Override
    public boolean prosesPembayaran (double jumlah){
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
```
### Class Kartu Debit
```java
package abstract_metode_pembayaran;

public class kartuDebit extends metodePembayaran {
    private String namaBank;
    private String nomerRekening;

    public kartuDebit (String nama, double saldo, String namaBank, String nomerRekening){
        super(nama, saldo);
        this.namaBank = namaBank;
        this.nomerRekening = nomerRekening;
    }

    @Override
    public boolean prosesPembayaran (double jumlah){
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
```
### Class Metode Pembayaran App
```java
package abstract_metode_pembayaran;

public class metodePembayaranApp {
    public static void main(String[] args) {
        kartuDebit M1 = new kartuDebit("Fauzan", 1000000, "BRI", "1234567890");
        M1.prosesPembayaran(500000);

        kartuKredit M2 = new kartuKredit("Fauzan", 1000000, "1234567890");
        M2.prosesPembayaran(500000);
    }
}
```
