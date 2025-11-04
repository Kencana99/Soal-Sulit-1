
import java.util.Scanner;

public class Soal1Sulit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==== Rekap Nilai Produktif ====");
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();

        double totalNilai = 0;

        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            double nilai = input.nextDouble();
            totalNilai += nilai;
        }

        double rataRata = totalNilai / jumlahSiswa;

        System.out.println("==== Hasil Nilai Produktif ====");
        System.out.println("Jumlah siswa : " + jumlahSiswa);
        System.out.println("Total nilai  : " + totalNilai);
        System.out.println("Rata-rata    : " + rataRata);

        input.close();
    }
}
