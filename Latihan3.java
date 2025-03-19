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

class Anjing extends Hewan {
    void suara() { 
        System.out.println("Guk Guk!"); 
    }
}

public class Latihan3 {
    public static void main(String[] args) {
        // Membuat objek Kucing dan Anjing
        Kucing kucing = new Kucing();
        Anjing anjing = new Anjing();
        
        // Memanggil method-method yang ada
        System.out.println("Kucing:");
        kucing.makan(); // Method dari superclass Hewan
        kucing.suara(); // Method dari subclass Kucing
        
        System.out.println("\nAnjing:");
        anjing.makan(); // Method dari superclass Hewan
        anjing.suara(); // Method dari subclass Anjing
    }
}

