import Controller.AdminController;
import Controller.MobilController;
import Model.ModelAdmin;
import NodeSewa.MobilNode;
import View.MenuAdmin;

public class Main {
    public static void main(String[] args) {
        MobilController mobilController = new MobilController();
        AdminController adminController = new AdminController();
        MobilNode mobilNode = new MobilNode("sedan",10000);
        MenuAdmin menuAdmin = new MenuAdmin(adminController, mobilController);
        ModelAdmin.dataAdmin();
        ModelAdmin.dataPenyewa();
        menuAdmin.menu();
    }
}