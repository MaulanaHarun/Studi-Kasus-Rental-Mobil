package View;

import Controller.AdminController;
import Controller.MobilController;

import java.util.Scanner;

public class MenuAdmin {
    Scanner scanner = new Scanner(System.in);
    AdminController adminController;
    MobilController mobilController;

    public MenuAdmin(AdminController adminController, MobilController mobilController) {
        this.adminController = adminController;
        this.mobilController = mobilController;
    }

    public void loginPenyewa() {
        try {
            boolean status = false;
            System.out.println("Masukkan Username: ");
            String username = scanner.next();
            System.out.println("Masukkan Password: ");
            String password = scanner.next();
            status = adminController.loginPenyewa(username, password);
            if (status) {
                System.out.println("Berhasil Login");
                penyewaMenu();
            } else {
                System.out.println("Username Atau Password Salah");
            }
        } catch (Exception e) {
            scanner.nextLine();
        }
    }
    public void menu() {
        int pilihan;
        do {
            System.out.println("1.Login Admin");
            System.out.println("2.Login Penyewa");
            System.out.println("3.Keluar");
            System.out.println("Pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    loginAdmin();
                    break;
                case 2:
                    loginPenyewa();
                    break;
                case 3:
                    System.out.println("Keluar");
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid");
            }
        } while (pilihan != 3);
    }

    public void loginAdmin() {
        try {
            boolean status = false;
            System.out.println("Masukkan Username: ");
            String username = scanner.next();
            System.out.println("Masukkan Password: ");
            String password = scanner.next();
            status = adminController.loginAdmin(username, password);
            if (status) {
                System.out.println("Berhasil Login");
                adminMenu();
            } else {
                System.out.println("Username Atau Password Salah");
            }
        } catch (Exception e) {
            scanner.nextLine();
        }
    }


    public void adminMenu() {
        int pilihan;
        do {
            System.out.println("Admin Menu");
            System.out.println("1.Tambah Mobil");
            System.out.println("2.Delete Mobil");
            System.out.println("3.Lihat Mobil");
            System.out.println("4.Kembali");
            System.out.println("Pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan Jenis Mobil: ");
                    String jenis = scanner.nextLine();
                    System.out.println("Masukkan Harga: ");
                    int harga = scanner.nextInt();
                    scanner.nextLine();
                    mobilController.insertMobil(jenis, harga);
                    System.out.println("Tambah Mobil berhasil!");
                    break;
                case 2:
                    System.out.println("Masukkan jenis mobil yang di delete");
                    jenis = scanner.nextLine();
                    mobilController.deleteMobil(jenis);
                    break;
                case 3:
                    mobilController.lihatMobil();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 0);
    }

    public void penyewaMenu() {
        System.out.println("Penyewa Menu");
    }
}
