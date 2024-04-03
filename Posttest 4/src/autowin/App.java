package autowin;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static int idCounter = 1;

    public static void main(String[] args) throws Exception {
        boolean berjalan = true;

        while (berjalan) {
            System.out.println("================================");
            System.out.println("Data Karyawan Bengkel Autowin");
            System.out.println("================================");
            System.out.println("1. Tambah Karyawan");
            System.out.println("2. Tampilkan Semua Karyawan");
            System.out.println("3. Perbarui Karyawan");
            System.out.println("4. Hapus Karyawan");
            System.out.println("5. Keluar");
            System.out.println("================================");
            System.out.println("Pilih Menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    tambahKaryawan();
                    break;
                case 2:
                    tampilkanKaryawan();
                    break;
                case 3:
                    perbaruiKaryawan();
                    break;
                case 4:
                    hapusKaryawan();
                    break;
                case 5:
                    berjalan = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void tambahKaryawan() {
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Posisi (Teknisi/Manajer): ");
        String posisi = scanner.nextLine();

        switch (posisi.toLowerCase()) {
            case "teknisi":
                System.out.print("Masukkan Jumlah Proyek: ");
                int jumlahProyek = scanner.nextInt();
                scanner.nextLine();
                Teknisi teknisi = new Teknisi(idCounter, nama, jumlahProyek);
                daftarKaryawan.add(teknisi);
                break;
            case "manajer":
                System.out.print("Masukkan Departemen: ");
                String departemen = scanner.nextLine();
                Manajer manajer = new Manajer(idCounter, nama, departemen);
                daftarKaryawan.add(manajer);
                break;
            default:
                System.out.println("Posisi tidak valid.");
                return;
        }

        idCounter++;
        System.out.println("Karyawan berhasil ditambahkan.");
    }

    private static void tampilkanKaryawan() {
        if (daftarKaryawan.isEmpty()) {
            System.out.println("Daftar karyawan kosong.");
        } else {
            System.out.println("==========================================");
            System.out.println("             Daftar Karyawan               ");
            System.out.println("==========================================");
            System.out.printf("%-5s | %-20s | %-10s\n", "ID", "Nama", "Posisi");
            System.out.println("------------------------------------------");
            for (Karyawan karyawan : daftarKaryawan) {
                System.out.printf("%-5d | %-20s | %-10s\n", karyawan.getId(), karyawan.getNama(), karyawan.getPosisi());
            }
            System.out.println("==========================================");
        }
    }

    private static void perbaruiKaryawan() {
        System.out.print("Masukkan ID karyawan yang ingin diperbarui: ");
        int id = scanner.nextInt();
        scanner.nextLine();
    
        boolean ditemukan = false;
        for (Karyawan karyawan : daftarKaryawan) {
            if (karyawan.getId() == id) {
                System.out.print("Masukkan Nama baru: ");
                String namaBaru = scanner.nextLine();
                System.out.print("Masukkan Posisi baru: ");
                String posisiBaru = scanner.nextLine();
    
                karyawan.perbaruiKaryawan(namaBaru, posisiBaru);
                System.out.println("Karyawan berhasil diperbarui.");
                ditemukan = true;
                break;
            }
        }
    
        if (!ditemukan) {
            System.out.println("Karyawan dengan ID tersebut tidak ditemukan.");
        }
    }

    private static void hapusKaryawan() {
        System.out.print("Masukkan ID karyawan yang ingin dihapus: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        boolean removed = false;
        for (int i = 0; i < daftarKaryawan.size(); i++) {
            Karyawan karyawan = daftarKaryawan.get(i);
            if (karyawan.getId() == id) {
                daftarKaryawan.remove(i);
                updateIdCounter();
                System.out.println("Karyawan berhasil dihapus.");
                removed = true;
                break;
            }
        }

        if (!removed) {
            System.out.println("Karyawan dengan ID tersebut tidak ditemukan.");
        }
    }

    private static void updateIdCounter() {
        idCounter = 1;
        for (Karyawan karyawan : daftarKaryawan) {
            karyawan.setId(idCounter);
            idCounter++;
        }
    }
}
