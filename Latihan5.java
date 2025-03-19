// Kelas Hewan sebagai superclass
class Hewan {
    String nama;

    // Konstruktor untuk inisialisasi nama hewan
    Hewan(String nama) {
        this.nama = nama;
    }

    // Method untuk menampilkan informasi nama hewan
    void info() {
        System.out.println("Nama: " + nama);
    }
}

// Subclass Kucing yang mewarisi dari Hewan
class Kucing extends Hewan {
    // Konstruktor Kucing yang memanggil konstruktor superclass
    Kucing(String nama) {
        super(nama);
    }

    // Method khusus untuk Kucing
    void meow() {
        System.out.println(nama + " sedang mengeong.");
    }
}

// Kelas utama sesuai dengan nama file: Latihan5
public class Latihan5 {
    public static void main(String[] args) {
        // Membuat objek Kucing
        Kucing kucing1 = new Kucing("Milo");

        // Memanggil method-method yang dimiliki oleh Kucing
        kucing1.info();  // Memanggil method dari superclass Hewan
        kucing1.meow();  // Memanggil method dari subclass Kucing
    }
}
