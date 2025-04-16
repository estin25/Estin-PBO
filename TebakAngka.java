import java.util.Scanner;

public class TebakAngka {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int angkaBenar = 71;  // Angka yang benar adalah 31
            int tebakan;
            int percobaan = 0;
            
            System.out.println("Selamat datang di permainan Tebak Angka!");
            System.out.println("Saya telah memilih angka antara 1 hingga 100.");
            System.out.println("Coba tebak atau ketik 0 untuk keluar.");
            
            while (true) {
                System.out.print("Masukkan tebakan Anda: ");
                tebakan = scanner.nextInt();
                
                if (tebakan == 0) {
                    System.out.println("Anda memilih keluar. Terima kasih telah bermain!");
                    break;
                }
                
                percobaan++;
                
                // Cek tebakan pengguna
                if (tebakan == angkaBenar) {
                    System.out.println("Selamat! Anda menebak angka dengan benar dalam " + percobaan + " percobaan.");
                    System.out.println("Terima kasih telah bermain!");
                    break;
                } else if (tebakan > angkaBenar) {
                    System.out.println("Terlalu besar! Coba lagi.");
                } else if (tebakan < angkaBenar) {
                    System.out.println("Terlalu kecil! Coba lagi.");
                }
            }
        } // Angka yang benar adalah 31
    }
}
