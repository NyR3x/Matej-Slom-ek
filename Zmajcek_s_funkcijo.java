import java.util.Scanner;

public class Zmajcek {
    static void izris_krila(int dolzina_krila)
    {
    for (int j = 1; j <= dolzina_krila; j++)
    {
        System.out.print(" ");
    }

        for (int j = 1; j <= 1; j++)
        {
        System.out.print("*");
        }
    }


    public static void main(String[] args) {

        Scanner vnos = new Scanner(System.in);
        System.out.println("Vnesi razpon kril ");
        int n = vnos.nextInt();
        int L=1;
        if(n==0)
        {
            return;
        }
            for (int i = 1; i <= n; i++)
            {
                izris_krila(n);
                L = L + 2;
                System.out.println();

            }
        for (int i = 1; i <= L; i++)
        {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 1; i <= n; i++)
        {
            izris_krila(n);
            System.out.println();

        }

    }
}