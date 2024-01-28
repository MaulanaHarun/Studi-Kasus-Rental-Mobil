package Controller;

import Model.MobilModel;

public class MobilController {
    MobilModel mobilModel;
    public void insertMobil(String jenis, int harga){
        mobilModel.addMobil(jenis, harga);
    }
    public void deleteMobil(String jenis){
        mobilModel.deleteMobil(jenis);
    }
    public void lihatMobil(){
        mobilModel.lihatMobil();
    }
}
