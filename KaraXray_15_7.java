public class KaraXray {
    private void narise_vrstice(int sirina, int i)
    {
        for (int j = 1; j <= sirina - i-1; j++)
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
 private void izris(int sirina)
 {


     for (int i = 0; i <= sirina - 2; i++)
     {
         narise_vrstice(sirina, i);
     }
     System.out.print("*");
     for (int i = 1; i <= (sirina - 1) * 2 - 1; i++)
     {
         System.out.print(" ");
     }
     System.out.print("*");
     System.out.println();

     for (int i = sirina - 2; i >= 0; i--)
     {
         narise_vrstice(sirina, i);
     }

 }
}
