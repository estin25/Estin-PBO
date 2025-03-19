class Hewan {
    void makan() {
        System.out.println("Hewan sedang makan.");
    }
}

class Kucing extends Hewan {
    void suara() {
        System.out.println("Meow!");
    }
}

class KucingAnggora extends Kucing {
    void jenis() {
        System.out.println("Ini adalah kucing anggora.");
    }
}

public class Latihan2 {
    public static void main(String[] args) {  // Perbaikan di sini (main method)
        // Membuat objek KucingAnggora
        KucingAnggora anggora = new KucingAnggora();
        
        // Memanggil method-method yang diwarisi dan dimiliki sendiri
        anggora.makan();  // Dari superclass Hewan
        anggora.suara();  // Dari subclass Kucing
        anggora.jenis();  // Dari subclass KucingAnggora
    }
}
