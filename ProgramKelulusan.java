import java.util.Scanner;

public class ProgramKelulusan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // nama
        System.out.print("Masukkan nama :");
        String nama = input.nextLine().toUpperCase();

        // prodi
        System.out.print("Masukkan Prodi :");
        String prodi = input.nextLine();

        // nilai
        System.out.print("Masukkan Nilai:");
        int nilai = input.nextInt();

        // kelulusan
        boolean lulus = false;

        if (prodi.equals("TI")) {
            if (nilai >= 171 && nilai <= 230) {
                lulus = true;
            }
        } else if (prodi.equals("SI")) {
            if (nilai >= 161 && nilai <= 210) {
                lulus = true;
            }
        }

        if (lulus) {
            System.out.println("Selamat, " + nama + "! Anda lulus di program studi " + prodi + ".");
        } else {
            System.out.println("Maaf," + nama + "! anda gagal di program studi" + prodi + ".");
        }

        input.close();
    }
}