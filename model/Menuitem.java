package model;
import controller.Customizable;

public abstract class Menuitem implements Customizable {
    protected String id;
    protected String nama;
    protected double hargaBase;
    protected int stok;

    public Menuitem(String id, String nama, double hargaBase, int stok) {
        this.id = id;
        this.nama = nama;
        this.hargaBase = hargaBase;
        this.stok = stok;
    }

    public String getId() { return id; }
    public String getNama() { return nama; }
    public double getHargaBase() { return hargaBase; }
    public int getStok() { return stok; }
    public void kurangiStok(int jumlah) { this.stok -= jumlah; }

    public abstract double hitungHargaTotal();
    public abstract String getOrderDetail();

    public double hitungHargaTotal(int jumlah) {
        return this.hargaBase * jumlah;
    }

    public double hitungHargaTotal(int jumlah, String kodePromo) {
        double total = hitungHargaTotal(jumlah);
        if (kodePromo != null && kodePromo.equalsIgnoreCase("COFFEE")) {
            total *= 0.5; 
        }
        return total;
    }

    public double hitungHargaTotal(int jumlah, EnumUkuran ukuran) {
        return (this.hargaBase + ukuran.getTambahanHarga()) * jumlah;
    }
}
 