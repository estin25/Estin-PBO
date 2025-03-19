// Kelas Kalkulator
class Kalkulator {

    // Metode pertama: Menjumlahkan dua angka
    int tambah(int a, int b) {
        return a + b;
    }

    // Metode kedua: Menjumlahkan tiga angka
    int tambah(int a, int b, int c) {
        return a + b + c;
    }

    // Metode ketiga: Menjumlahkan dua angka desimal
    double tambah(double a, double b) {
        return a + b;
    }
}

// Kelas utama
public class Latihan6 {
    public static void main(String[] args) {
        Kalkulator k = new Kalkulator();

        System.out.println(k.tambah(5, 10));      // Output: 15
        System.out.println(k.tambah(5, 10, 15));  // Output: 30
        System.out.println(k.tambah(5.5, 2.5));   // Output: 8.0
    }
}
