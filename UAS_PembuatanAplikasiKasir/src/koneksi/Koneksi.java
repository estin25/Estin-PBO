/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Koneksi {

    public static Connection getConnection() {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/kasir";
        String user = "root";
        String pass = ""; // ubah jika pakai password
        return DriverManager.getConnection(url, user, pass);
    } catch (Exception e) {
        System.err.println("Koneksi gagal: " + e.getMessage());
        return null;
    }
}
    private Connection conn;
    private Statement stm;

    public Connection connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/kasir";
            String user = "root";
            String pass = "";
            conn = DriverManager.getConnection(url, user, pass);
            stm = conn.createStatement();
            System.out.println("Koneksi berhasil!");
        } catch (Exception e) {
            System.err.println("Koneksi gagal: " + e.getMessage());
        }
        return conn;
    }
}

