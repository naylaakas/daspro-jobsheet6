import java.util.Scanner;
public class Latihan2 {

    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);

        String jenisBuku;
        int jumlahBuku;
        double diskon;

        System.out.print("Masukkan jenis buku : ");
        jenisBuku = input21.nextLine();

        System.out.print("Masukkan jumlah buku yang dibeli : ");
        jumlahBuku = input21.nextInt();

        if (jenisBuku.equals("kamus")) {
            diskon = 0.1;
            System.out.println("Diskon = 10% ");
        }
            if (jumlahBuku > 2) {
                diskon = 0.02;
                System.out.println("membeli buku lebih dari 2, mendapat tambahan diskon sebanyak 2% ");
            }

        if (jenisBuku.equals("novel")) {
            diskon = 0.07;
            System.out.println("Diskon = 7% ");
        }
            if (jumlahBuku > 3) {
                diskon = 0.02;
                System.out.println("membeli buku lebih dari 3, mendapat tambahan diskon sebanyak 2% ");
            } else if ((jumlahBuku <= 3) && (jenisBuku == "novel")) {
                diskon = 0.01;
                System.out.print("membeli buku kurang dari atau sama engan 3, mendapat tambahan diskon sebanyak 1% ");
            }
        
        if (jenisBuku.equals("buku lain")) {    
        }
            if (jumlahBuku > 3) {
                diskon = 0.05;
                System.out.println("membeli buku selain kamus dan novel lebih dari 3, mendapat tambahan diskon sebanyak 5% ");
            }
    }   
}