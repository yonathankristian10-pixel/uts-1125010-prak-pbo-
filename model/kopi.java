package model;
import java.util.List;

public class Kopi extends Menuitem {
    private int rum = 0;   
    private int es = 0;     
    private int gula = 0;    
    private int karamel = 0; 

    public Kopi(String id, String nama, double hargaBase, int stok) {
        super(id, nama, hargaBase, stok);
    }
    @Override
    public double hitungHargaTotal() {
        double tambahan = (rum * 3000) + (karamel * 3000);
        return hargaBase + tambahan;
    }
}