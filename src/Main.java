import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Elmasın yüksekliğini (tek sayı) girin: ");
        int yukseklik = scanner.nextInt();

        if (yukseklik % 2 == 0) {
            System.out.println("Lütfen tek sayı girin.");
            return;
        }

        int yariYukseklik = yukseklik / 2;

        // Üst kısım
        for (int i = 0; i <= yariYukseklik; i++) {
            for (int j = 0; j < yariYukseklik - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Alt kısım
        for (int i = yariYukseklik - 1; i >= 0; i--) {
            for (int j = 0; j < yariYukseklik - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
