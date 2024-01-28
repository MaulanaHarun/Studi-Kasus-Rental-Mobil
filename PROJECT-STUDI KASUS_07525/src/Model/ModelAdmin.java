package Model;

import NodeSewa.AdminNode;
import NodeSewa.PenyewaNode;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ModelAdmin {
    private static ArrayList<AdminNode> arrayAdmin = new ArrayList<>();
    private static ArrayList<PenyewaNode> arrayPenyewa = new ArrayList<>();

    public static ArrayList<AdminNode> allArrayAdmin(){
        return arrayAdmin;
    }
    public static ArrayList<PenyewaNode> allArrayPenyewa(){
        return arrayPenyewa;
    }
    public static void dataAdmin(){
        arrayAdmin.add(new AdminNode("harun","1234"));
    }
    public static void dataPenyewa(){
        arrayPenyewa.add(new PenyewaNode("maulana","4321"));
    }
    public static boolean loginAdmin(String username, String password){
        for(AdminNode objAdmin : arrayAdmin){
            if(objAdmin.getUsername().equals(username)&&objAdmin.getPassword().equals(password));
            return true;
        }
        return false;
    }
    public static boolean loginPenyewa(String username, String password){
        for(PenyewaNode objPenyewa : arrayPenyewa){
            if(objPenyewa.getUsername().equals(username)&&objPenyewa.getPassword().equals(password));
            return true;
        }
        return false;
    }
}






