import java.util.Scanner;

public class Objektno {
    public static void main(String[] args) {
        Scanner vnos = new Scanner(System.in);
        System.out.println("Vnesi stevilo\n"  +
                "1. izris kare\n" +
                "2. izris zamaja\n" +
                "3. izris Xraj kare");
        int m = vnos.nextInt();
        switch (m){
            case 1:
                kara novaKara=new kara();
                System.out.println("Vnesi sirino kare");
                int n = vnos.nextInt();
                novaKara.sirinaKare=n;
                if(novaKara.sirinaKare==0){
                    return;
                }

                int sredina = (novaKara.sirinaKare+1)/2;
                for (int i = 1; i <= sredina; i++) {
                    for (int j = 1; j <= sredina - i; j++) {
                        System.out.print(" ");
                    }

                    for (int j = 1; j <= i * 2 - 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();

                }
                for (int i =((novaKara.sirinaKare+1)/2) - 1; i >= 1; i--) {
                    for (int j = 1; j <= sredina - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= i * 2 - 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Vnesi sirino zmaja");
                int c = vnos.nextInt();
                zmaj novZmaj=new zmaj();
                novZmaj.sirinaZmaja=c;
                if (novZmaj.sirinaZmaja == 0)
                {
                    return;
                }
                int middle = (novZmaj.sirinaZmaja+1)/2;
                for (int i = 1; i <= novZmaj.sirinaZmaja- 1; i++)
                {
                    for (int j = 1; j <= novZmaj.sirinaZmaja - i; j++)
                    {
                        System.out.print(" ");
                    }
                    for (int v = 1; v <= i * 2 - 1; v++)
                    {
                        System.out.print("*");

                    }
                    System.out.println();
                }
                for (int i = 1; i <= novZmaj.sirinaZmaja; i++)
                {
                    System.out.print("* ");
                }
                System.out.println();
                for (int i = novZmaj.sirinaZmaja - 1; i >= 1; i--)
                {
                    for (int j = 1; j <= novZmaj.sirinaZmaja - i; j++)
                    {
                        System.out.print(" ");
                    }
                    for (int u = 1; u <= i * 2 - 1; u++)
                    {
                        if(i==1)System.out.print("+");
                        else
                            System.out.print("*");

                    }
                    System.out.println();
                }
                for (int d=1;d<3;d++) {
                    for (int j = 1; j <= middle; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("+");
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("Vnesi sirino za XrejKaro");
                int f = vnos.nextInt();
                XrajKare novXraj=new XrajKare();
                novXraj.sirinaXreja=f;
                for (int i = 0; i <= novXraj.sirinaXreja - 2; i++)
                {
                    for (int j = 1; j <= novXraj.sirinaXreja - i-1; j++)
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
                for(int i=1;i<=(novXraj.sirinaXreja-1)* 2 - 1;i++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();

                for (int i = novXraj.sirinaXreja - 2; i >= 0; i--)
                {
                    for (int j = 1; j <= novXraj.sirinaXreja - i-1; j++)
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
                break;
}


    }
    }
    class kara{
    int sirinaKare;
    }

    class zmaj{
    int sirinaZmaja;
    }
    class XrajKare{
    int sirinaXreja;
}