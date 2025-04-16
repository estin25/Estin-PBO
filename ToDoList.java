import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> daftarTugas = new ArrayList<>();

        while (true) {
            System.out.println("Menu TO - DO List");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Tambah semua Tuges"); // Sesuai penulisan yang kamu minta
            System.out.println("3. Hapus Tugas");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Buang newline

            switch (pilihan) {
                case 1 -> {
                    System.out.print("Masukkan tugas baru: ");
                    String tugas = scanner.nextLine();
                    daftarTugas.add(tugas);
                    System.out.println("Tugas berasil di tambahkan!");
                }

                case 2 -> {
                    System.out.println("DAFTAR TUGAS");
                    if (daftarTugas.isEmpty()) {
                        System.out.println("Belum ada tugas.");
                    } else {
                        for (int i = 0; i < daftarTugas.size(); i++) {
                            System.out.println((i + 1) + ". " + daftarTugas.get(i));
                        }
                    }
                }

                case 3 -> {
                    System.out.print("Masukkan nomor tugas yang ingin di hapus: ");
                    int index = scanner.nextInt();
                    if (index > 0 && index <= daftarTugas.size()) {
                        daftarTugas.remove(index - 1);
                        System.out.println("Tugas berasil dihapus.");
                    } else {
                        System.out.println("Nomor tugas tidak valid.");
                    }
                }

                case 4 -> {
                    System.out.println("Terima kasih telah menggunakan TO-DO List.");
                    scanner.close();
                    return;
                }

                default -> System.out.println("Pilihan tidak valid.");
            }
            System.out.println(); // Spasi antar menu
        }
    }
}
