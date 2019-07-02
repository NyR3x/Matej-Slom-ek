import java.util.Scanner;

public class Kara_Funkcija_lastnosti {
    static void narisi_vrstico(int stevilo_presledkov, int stevilo_zvezdic) {
        for (int i = 1; i <= stevilo_presledkov; i++) {
            System.out.print(" ");
        }
        for (int i = 1; i <= stevilo_zvezdic; i++) {
            System.out.print("*");
        }

    }

    public static void main(String[] args) {
        Scanner vnos = new Scanner(System.in);
        System.out.println("Vnesi sirino kare");
        int n = vnos.nextInt();
        if (n == 0) {
            return;
        }
        for (int i = 1; i <= n; i++) {
            narisi_vrstico(n - i, i * 2 - 1);
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            narisi_vrstico(n - i, i * 2 - 1);
            System.out.println();
        }
    }
}