/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kendaraan;

/**
 *
 * @author Lenovo
 */

public class Kendaraan {
    // Atribut
    String merk;
     String tipe;
    private int kecepatan;

    // Konstruktor
    public Kendaraan(String merk, String tipe, int kecepatan) {
        this.merk = merk;
        this.tipe = tipe;
        this.kecepatan = kecepatan;
    }

    // Metode untuk menampilkan informasi kendaraan
    public void tampilkanInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Tipe: " + tipe);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }

    // Metode untuk menambah kecepatan kendaraan
    public void tambahKecepatan(int km) {
        this.kecepatan += km;
    }

    // Metode untuk mengurangi kecepatan kendaraan
    public void kurangiKecepatan(int km) {
        if (this.kecepatan - km >= 0) {
            this.kecepatan -= km;
        } else {
            this.kecepatan = 0;
        }
    }

    // Metode untuk menghentikan kendaraan
    public void berhenti() {
        this.kecepatan = 0;
        System.out.println("Kendaraan telah berhenti.");
    }

    public static void main(String[] args) {
        // Contoh penggunaan kelas Kendaraan
        Kendaraan mobil = new Kendaraan("Toyota", "Mobil", 60);
        mobil.tampilkanInfo();

        mobil.tambahKecepatan(20);
        mobil.tampilkanInfo();

        mobil.kurangiKecepatan(30);
        mobil.tampilkanInfo();

        mobil.berhenti();
        mobil.tampilkanInfo();
    }
}

public class Kendaraan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
