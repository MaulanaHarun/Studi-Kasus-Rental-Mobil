package Model;

import NodeSewa.MobilNode;

import java.util.ArrayList;

public class MobilModel {
    private ArrayList<MobilNode> arrayMobil = new ArrayList<>();

    public ArrayList<MobilNode> allArrayMobil() {
        return arrayMobil;
    }

    public void addMobil(String jenisMobil, int harga) {
        MobilNode newMobil = new MobilNode(jenisMobil, harga);
        arrayMobil.add(newMobil);
    }

    public void deleteMobil(String jenisMobil) {
        MobilNode mobilToDelete = null;
        for (MobilNode mobil : arrayMobil) {
            if (mobil.getJenisMobil().equals(jenisMobil)) {
                mobilToDelete = mobil;
                break;
            }
        }

        if (mobilToDelete != null) {
            arrayMobil.remove(mobilToDelete);
            System.out.println("Mobil " + jenisMobil + " berhasil dihapus.");
        } else {
            System.out.println("Mobil " + jenisMobil + " tidak ditemukan.");
        }
    }
    public void lihatMobil() {
        System.out.println("Daftar Mobil:");

        for (MobilNode mobil : arrayMobil) {
            System.out.println("Jenis: " + mobil.getJenisMobil() + ", Harga: " + mobil.getHarga());
        }
    }
}
