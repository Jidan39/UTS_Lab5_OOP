import java.util.Scanner;

public class Main {

    // fungsi untuk mengecek apakah kata yang dimasukkan oleh user adalah palindrome
    public static boolean PalindromBjir(String kata) {

        // membuat kata yang dimasukkan menjadi lower case
        kata = kata.toLowerCase();

        int left = 0;
        int right = kata.length() - 1;

        // Memeriksa karakter dari kedua ujung string
        while (left < right) {
            // Jika karakter tidak sama, maka bukan palindrome
            if (kata.charAt(left) != kata.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        // Jika semua karakter cocok, maka dia akan return true
        return true;
    }

    public static void main(String[] args) {
        // membuat scanner untuk menerima input dari user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah kata: ");
        String input = scanner.nextLine();

        // memeriksa apakah input adalah palindrome
        boolean result = PalindromBjir(input);

        // bagian yang menampilkan output
        if (result == true) {
            System.out.println("Kata yang kau masukkan merupakan palindrome");
        } else {
            System.out.println("Kata yang kau masukkan bukan palindrome");
        }

        scanner.close();
    }
}
