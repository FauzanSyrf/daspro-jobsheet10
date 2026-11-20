import java.util.Scanner;

public class BioskopWithScanner12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, next;
        String[][] penonton = new String[4][2];
        while (true) {
            System.out.println("\n Menu Bioskop ");
            System.out.println("1. Input Data Penonton");
            System.out.println("2. Tampilkan Daftar Penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();
            if (menu == 1) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    while (true) {
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();
                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2){
                            System.out.println("kursi tidak tersedia, pilih kembali");
                            continue;
                        }else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi sudah diisi " + penonton[baris - 1][kolom - 1] + ", pilih kembali");
                        } else {
                            penonton[baris - 1][kolom - 1] = nama;
                            break; 
                        }
                    }

                    System.out.print("input penonton lainnya? (y/n): ");
                    next = sc.nextLine();
        
                    if (next.equalsIgnoreCase("n")) {
                        break;  
                }
            }       
        }
        else if (menu == 2){
            for (int i = 0; i < penonton.length; i++) {
                for (int j = 0; j < penonton[i].length; j++) {
                    if (penonton[i][j] == null) {
                        System.out.print("*** ");
                    }else{
                        System.out.print(penonton[i][j] + " ");
                    }
                }
                System.out.println();
            }
            }
        else if (menu == 3) {
            break;
        }
        else {
            System.out.println("menu tidak valid");
        }
        }
    }
}
