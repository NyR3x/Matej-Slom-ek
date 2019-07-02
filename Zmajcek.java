import java.util.Scanner;

public class Zmajcek {
    public static void main(String[] args) {

        Scanner vnos = new Scanner(System.in);
        System.out.println("Vnesi razpon kril od 3 do 39 ");
        int n = vnos.nextInt();
        int m = n;
        int L=1;
        if(n==0){
            return;
        }
        if(n % 2 == 0){
            n = n-1;
        }

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= 1; j++) {
                    System.out.print("*");
                }
                L = L + 2;
                System.out.println();

            }
        for (int i = 1; i <= L; i++){
            System.out.print("*");
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}