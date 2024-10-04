import java.util.Scanner;

public class Pertanyaan4Percobaan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        byte pilihan_menu;
        String member;
        double diskon, harga, totalBayar;
        
        System.out.println("-----------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-----------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-----------------------------");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input.nextByte();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input.next();
        System.out.print("Metode Pembayaran (qris/ Lainnya) = ");
        String metodePembayaran = input.next();
        System.out.println("-----------------------------");
        
       
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10; 
            System.out.println("Besar diskon= 10% ");
        } else if (member.equalsIgnoreCase("n")) {
            diskon = 0.0; 
        } else {
            System.out.println("Member tidak valid");
            return;
        }

        if (pilihan_menu == 1) {
            harga = 14000;
            System.out.println("Harga Ricebowl = Rp" + harga);
        } else if (pilihan_menu == 2) {
            harga = 3000;
            System.out.println("Harga Ice Tea = Rp" + harga);
        } else if (pilihan_menu == 3) {
            harga = 15000;
            System.out.println("Harga Bundling = Rp" + harga);
        } else {
            System.out.println("Masukkan menu yang benar");
            return;
        }

        totalBayar = harga - (harga * diskon);
        if (metodePembayaran.equalsIgnoreCase("qris")) {
            totalBayar -= 1000; 
        }
        System.out.println("Total bayar = Rp" + totalBayar);
        System.out.println("-------------------------------------");
        
      
    }
}