import java.util.Scanner;
    public class Pemilihan2Percobaan216 {

        public static void main(String[] args) {
            Scanner input16 = new Scanner(System.in);
int pilihan_menu, harga;
String member;
double diskon, totalBayar;

System.out.println("---------------------");
System.out.println("=== MENU KAFE JTI ===");
System.out.println("---------------------");
System.out.println("1. Ricebowl");
System.out.println("2. Ice Tea");
System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
System.out.println("--------------------------------------");
System.out.print("Masukkan Angka dari Menu yang Dipilih = ");
pilihan_menu = input16.nextInt();
input16.nextLine();
System.out.print("Apakah punya Member (y/n) ? = ");
member = input16.nextLine();
System.out.println("--------------------------------------");

if (member.equalsIgnoreCase("y")) {
    diskon = 0.10;
    System.out.println("Besar Diskon = 10%");
    if (pilihan_menu == 1){
        harga = 14000;
        System.out.println("Harga Ricebowl = " + harga);

    } else if (pilihan_menu == 2){
        harga = 3000;
        System.out.println("Harga Ice Tea = " + harga);

    } else if (pilihan_menu == 3) {
        harga = 15000;
        System.out.println("Harga Bundling = " + harga);
    
    } else {
        System.out.println("Masukkan Pilihan Menu Dengan Benar");
        return;
    }

totalBayar = harga - (harga * diskon);
System.out.println("Total Bayar Setelah Diskon = " + totalBayar);
}

else if (member.equalsIgnoreCase("n")) {
    if (pilihan_menu == 1) {
        harga = 14000;
        System.out.println("Harga Ricebowl = " + harga);
    
    } else if (pilihan_menu == 2) {
        harga = 3000;
        System.out.println("Harga Ice Tea = " + harga);
    
    } else if (pilihan_menu == 3) {
        harga = 15000;
        System.out.println("Harga Bundling = " + harga);
    
    } else {
        System.out.println("Masukkan Pilihan Menu yang Benar");
        return;
    }

    System.out.println("Total Bayar = " + harga);

} else {
    System.out.println("Member Tidak Valid");
}
System.out.println("--------------------------------------");
}
}
    

