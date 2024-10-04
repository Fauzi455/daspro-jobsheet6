 import java.util.Scanner;   
    public class Tugas3Jobsheet6No1 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
int bil1, bil2, bil3;
int terbesar1, terbesar2, terbesar3;

System.out.print("Masukkan Bilangan Pertama: ");
bil1 = sc.nextInt();
System.out.print("Masukkan Bilangan Kedua: ");
bil2 = sc.nextInt();
System.out.print("Masukkan Bilangan Ketiga: ");
bil3 = sc.nextInt();
            
if (bil1 >= bil2 && bil1 >= bil3) {
    terbesar1 = bil1;
    if (bil2 >= bil3) {
        terbesar2 = bil2;
        terbesar3 = bil3;
    } else {
        terbesar2 = bil3;
        terbesar3 = bil2;
    }
} else if (bil2 >= bil1 && bil2 >= bil3) {
    terbesar1 = bil2;
    if (bil1 >= bil3) {
        terbesar2 = bil1;
        terbesar3 = bil3;
    } else {
        terbesar2 = bil3;
        terbesar3 = bil1;
    }
} else {
    terbesar1 = bil3;
    if (bil1 >= bil2) {
        terbesar2 = bil1;
        terbesar3 = bil2;
    } else {
        terbesar2 = bil2;
        terbesar3 = bil1;
    }
    }
System.out.println("Bilangan Terbesar ke-1: " + terbesar1);
System.out.println("Bilangan Terbesar ke-2: " + terbesar2);
System.out.println("Bilangan Terbesar ke-3: " + terbesar3); 
        }
    
}
