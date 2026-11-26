import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] survei = new int[10][6];
        int totalSemua = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < 6; j++) {
                while (true) {
                    System.out.print("Masukkan nilai pertanyaan ke-" + (j + 1) + " (1-5): ");
                    int nilai = input.nextInt();
                    
                    if (nilai < 1 || nilai > 5) {
                        System.out.println("Nilai tidak valid, masukkan angka 1 sampai 5.");
                    } else {
                        survei[i][j] = nilai;
                        break;
                    }
                }
            }
        }
        System.out.println("Rata-rata per responden");
        for (int i = 0; i < 10; i++) {
            double totalNilaiResponden = 0;
            for (int j = 0; j < 6; j++) {
                totalNilaiResponden += survei[i][j];
            }
            double rata2Nilai = totalNilaiResponden / 6;
            System.out.println("Responden ke-" + (i + 1) + ": " + rata2Nilai);
        }
        System.out.println("Rata-rata per pertanyaan");
        for (int j = 0; j < 6; j++) {
            double nilaiPertanyaan = 0;
            for (int i = 0; i < 10; i++) {
                nilaiPertanyaan += survei[i][j];
            }
            double rata2PerPertanyaan = nilaiPertanyaan / 10;
            System.out.println("Pertanyaan ke-" + (j + 1) + ": " + rata2PerPertanyaan);
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalSemua += survei[i][j];
            }
        }
        double rata2Semua = (double) totalSemua / 60;
        System.out.println("Rata-rata semua: " + rata2Semua);

        input.close();
    }
}