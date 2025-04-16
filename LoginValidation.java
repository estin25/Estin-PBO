import java.util.Scanner;

public class LoginValidation {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String validUsername = "admin";
            String validPassword = "password123";
            
            int attempts = 0;
            boolean success = false;
            
            while (attempts < 3 && !success) {
                System.out.print("Masukkan username: ");
                String username = scanner.nextLine();
                
                System.out.print("Masukkan password: ");
                String password = scanner.nextLine();
                
                if (username.equals(validUsername) && password.equals(validPassword)) {
                    System.out.println("Selamat datang, " + username + "!");
                    success = true;
                } else {
                    attempts++;
                    if (attempts < 3) {
                        System.out.println("Username atau password salah! Percobaan: " + attempts + "/3");
                    }
                }
            }
            
            if (!success) {
                System.out.println("Akun diblokir!");
            }
        }
    }
}
