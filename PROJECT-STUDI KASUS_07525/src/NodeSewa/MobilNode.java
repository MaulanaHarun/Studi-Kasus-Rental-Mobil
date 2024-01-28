package NodeSewa;

public class MobilNode {
    String jenisMobil;
    int harga;

    public MobilNode(String jenisMobil, int harga) {
        this.jenisMobil = jenisMobil;
        this.harga = harga;
    }

    public String getJenisMobil() {
        return jenisMobil;
    }

    public void setJenisMobil(String jenisMobil) {
        this.jenisMobil = jenisMobil;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
