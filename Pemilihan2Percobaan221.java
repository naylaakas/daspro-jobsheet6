import java.util.Scanner;
public class Pemilihan2Percobaan221 {

    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        String member, jenisPembayaran;
        int pilihan_menu;
        double diskon,harga,total_bayar;

        System.out.println("-----------------------");
        System.out.println("==== MENU KAFE JTI ====");
        System.out.println("-----------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input21.nextInt();
        input21.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        System.out.print("pilih jenis pembayaran (cash/QRIS) : ");
        jenisPembayaran = input21.nextLine();
        member = input21.nextLine();
        System.out.println("--------------------------------------");

        if (member.equalsIgnoreCase("y")) { // Menggunakan equalsIgnoreCase untuk membandingkan string
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

            } else {
                System.out.println("Masukkan pilih menu dengan benar");
                return; // Menghentiikan eksekusi lebih lanjut jika pilihan salah
            }

            // Menghitung total bayar setelah diskon
            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);
        }

    else if (member.equalsIgnoreCase("n")) { //Menggunakan equalsIgnoreCase untuk membandingkan string
        if (pilihan_menu == 1) {
            harga = 14000;
            System.out.println("Harga ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
            harga = 3000;
            System.out.println("Harga ice tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; // Menghentikan eksekusi lebih lanjut jika pilihan salah
            }
            //Menghitung total bayar
            System.out.println("Total bayar = " + harga);

        } else {
            System.out.println("Member tidak valid");
        } 
        System.out.println("-------------------------------------");  
    }
}