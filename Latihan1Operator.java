import java.util.Scanner;
public class Latihan1Operator {

    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        int bil1, bil2, bil3;

        System.out.print("Masukkan bilangan pertama : ");
        bil1 = input21.nextInt();

        System.out.print("Masukkan bilangan kedua : ");
        bil2 = input21.nextInt();

        System.out.print("Masukkan bilangan ketiga : ");
        bil3 = input21.nextInt();

        if ((bil1 > bil2) && (bil1 > bil3)) {
            System.out.println("bilangan terbesar adalah bilangan 1");    
        } else if ((bil2 > bil1) && (bil2 > bil3)) {
            System.out.println("bilangan terbesar adalah bilangan 2");
        } else if ((bil3 > bil1) && (bil3 > bil1)) {
            System.out.println("bilangan terbesar adalah bilangan 3");
        }
    }
}