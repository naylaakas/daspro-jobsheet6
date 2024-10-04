import java.util.Scanner;
public class Latihan3 {

    public static void main(String[] args){
        Scanner input21 = new Scanner(System.in);
        String merk, kategori;
        int ukuran, harga;

        System.out.print("Masukkan merk sepatu : ");
        merk = input21.nextLine();

        System.out.print("Masukkan kategori sepatu : ");
        kategori = input21.nextLine();

        System.out.print("Masukkan ukuran sepatu : ");
        ukuran = input21.nextInt();

        if (kategori.equals("slip on")) {
        if (merk.equals("specs")) {
            if (ukuran >= 36) {
            if (ukuran <= 40) {
                harga = 800000;
                System.out.println("sepatu tersebut berharga " + harga);
            }
            }
        }
        }

        if (kategori.equals("high top")) {
        if (merk.equals("specs")) {
            if (ukuran >= 40) {
            if (ukuran <= 44) {
                    harga = 1200000;
                    System.out.println("sepatu tersebut berharga " + harga);
            }
            }
        }
        }

        if (kategori.equals("woman")) {
        if (merk.equals("910")) {
            if (ukuran >= 36) {
            if (ukuran <= 41) {
                    harga = 1000000;
                    System.out.println("sepatu tersebut berharga " + harga);
            }
            }
        }
        }

        if (kategori.equals("man")) {
        if (merk.equals("910")) {
            if (ukuran >= 41) {
            if (ukuran <= 44) {
                        harga = 1800000;
                        System.out.println("sepatu tersebut berharga " + harga);
            }
            }
        }
        } 

        if (kategori.equals("kids")) {
        if (merk.equals("ortus")) {
            if (ukuran >= 36) {
            if (ukuran <= 40) {
                        harga = 750000;
                        System.out.println("sepatu tersebut berharga " + harga);
            }
            }
        }
        }

        if (kategori.equals("adult")) {
            if (merk.equals("ortus")) {
                if (ukuran >= 40) {
                if (ukuran <= 44) {
                        harga = 1500000;
                        System.out.println("sepatu tersebut berharga " + harga);
            }
            }
        }    
        } else {
            System.out.println("tidak valid");
        } 
    }

}