package Controller;

import Model.ModelAdmin;
import NodeSewa.AdminNode;

public class AdminController {
    public boolean loginAdmin(String username, String password){
        return ModelAdmin.loginAdmin(username,password);
    }
    public boolean loginPenyewa(String username, String password){
        return ModelAdmin.loginPenyewa(username, password);
    }
}
