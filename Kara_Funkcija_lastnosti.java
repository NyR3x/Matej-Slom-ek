import java.util.Scanner;

public class Kara_Funkcija_lastnosti {
    static void narisi_vrstico(int stevilo_presledkov, int stevilo_zvezdic) {
        for (int i = 1; i <= stevilo_presledkov; i++)
            System.out.print(" ");

        for (int i = 1; i <= stevilo_zvezdic; i++)
            System.out.print("*");

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner vnos = new Scanner(System.in);
        System.out.println("Vnesi sirino kare");
        int n = vnos.nextInt();

        if (n == 0) return;

        int sredina = (n+1)/2;

        for (int i = 1; i <= sredina; i++)
            narisi_vrstico(sredina - i, i * 2 - 1);

        for (int i = ((n+1)/2) - 1; i >= 1; i--)
            narisi_vrstico(sredina - i, i * 2 - 1);
    }
}
