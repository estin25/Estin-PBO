// Kelas induk (superclass)
class Hewan {
    String nama; // Variabel untuk menyimpan nama hewan

    void makan() {
        System.out.println(nama + " sedang makan.");
    }
}

// Kelas anak (subclass) yang mewarisi dari Hewan
class Kucing extends Hewan {
    void suara() {
        System.out.println(nama + " mengeong: Meow!");
    }
}

// Main class untuk menjalankan program
public class Latihan1 {
    public static void main(String[] args) {
        // Membuat objek Kucing
        Kucing kucing1 = new Kucing();

        // Memberikan nilai atribut nama
        kucing1.nama = "Tom";

        // Memanggil metode dari superclass dan subclass
        kucing1.makan(); // Dari superclass Hewan
        kucing1.suara(); // Dari subclass Kucing
    }
}
