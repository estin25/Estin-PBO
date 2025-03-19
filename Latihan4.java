// Interface pertama
interface Hewan {
    void makan();
}

// Interface kedua
interface Mamalia {
    void menyusui();
}

// Kelas Kucing mengimplementasikan dua interface
class Kucing implements Hewan, Mamalia {
    public void makan() { 
        System.out.println("Kucing makan ikan."); 
    }

    public void menyusui() { 
        System.out.println("Kucing menyusui anaknya."); 
    }
}

// Kelas utama untuk menjalankan program
public class Latihan4 {
    public static void main(String[] args) {
        // Membuat objek Kucing
        Kucing kucing1 = new Kucing();

        // Memanggil method-method yang dimiliki oleh Kucing
        kucing1.makan();     // Dari interface Hewan
        kucing1.menyusui();  // Dari interface Mamalia
    }
}

