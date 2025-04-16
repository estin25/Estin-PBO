import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            char ulangi;
            
            do {
                System.out.print("Masukkan angka pertama: ");
                double angka1 = scanner.nextDouble();
                
                System.out.print("Masukkan operator (+,-,*,/,%) : ");
                char operator = scanner.next().charAt(0);
                
                System.out.print("Masukkan angka kedua: ");
                double angka2 = scanner.nextDouble();
                
                double hasil;
                boolean valid = true;
                
                switch (operator) {
                    case '+' -> hasil = angka1 + angka2;
                    case '-' -> hasil = angka1 - angka2;
                    case '*' -> hasil = angka1 * angka2;
                    case '/' -> {
                        if (angka2 != 0) {
                            hasil = angka1 / angka2;
                        } else {
                            System.out.println("Error: Pembagian dengan nol!");
                            valid = false;
                            hasil = 0;
                        }
                    }
                    case '%' -> {
                        if (angka2 != 0) {
                            hasil = angka1 % angka2;
                        } else {
                            System.out.println("Error: Modulus dengan nol!");
                            valid = false;
                            hasil = 0;
                        }
                    }
                    default -> {
                        System.out.println("Operator tidak valid!");
                        valid = false;
                        hasil = 0;
                    }
                }
                
                if (valid) {
                    System.out.println("Hasil: " + hasil);
                }
                
                System.out.print("Apakah Anda ingin menghitung lagi? (y/n): ");
                ulangi = scanner.next().charAt(0);
                
            } while (ulangi == 'y' || ulangi == 'Y');
            
            System.out.println("Terima kasih telah menggunakan kalkulator!");
        }
    }
}
