import java.util.Scanner;

public class Zmajcek_V_Celoti {

    public static void main(String[] args)
    {

        Scanner vnos = new Scanner(System.in);
        System.out.println("Vnesi stevilo zvezdic na sredino krila ");
        int n = vnos.nextInt();
        int L = 1;
        if (n == 0)
        {
            return;
        }
        for (int i = 1; i <= n - 1; i++)
        {
            for (int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }
            for (int m = 1; m <= i * 2 - 1; m++)
            {
                System.out.print("*");

            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++)
        {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = n - 1; i >= 1; i--)
        {
            for (int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }
            for (int m = 1; m <= i * 2 - 1; m++)
            {
                if(i==1)System.out.print("+");
                else
                    System.out.print("*");

            }
            System.out.println();
        }
        for (int i = 0; i <= n - 2; i++)
        {
            for (int j = 1; j <= n - i-1; j++)
            {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int k = 1; k <= i * 2 - 1; k++)
            {

                System.out.print(" ");
            }
            if(i!=0)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print("*");
        for(int i=1;i<=(n-1)* 2 - 1;i++)
        {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();

        for (int i = n - 2; i >= 0; i--)
        {
            for (int j = 1; j <= n - i-1; j++)
            {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int k = 1; k <= i * 2 - 1; k++)
            {
                System.out.print(" ");
            }
            if(i!=0)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n - 1; i++)
        {
            for (int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }
            for (int m = 1; m <= i * 2 - 1; m++)
            {
                if(i==1)System.out.print("+");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++)
        {

            System.out.print("* ");
        }
        System.out.println();
        for (int i = n - 1; i >= 1; i--)
        {
            for (int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }
            for (int m = 1; m <= i * 2 - 1; m++)
            {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
