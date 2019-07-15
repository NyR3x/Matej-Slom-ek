
public class Kara {

private void narisi_vrstico(int sredina, int i)
        {
            for (int j = 1; j <= sredina - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++)
            {
                System.out.print("*");
            }
            System.out.println();


            }
public void prikaz(int input)
{
                if(input==0)return;
    int sredina = (input+1)/2;
                for (int i = 1; i <= sredina; i++)
                {
                    narisi_vrstico(sredina,i);

    }
                for (int i =((input+1)/2) - 1; i >= 1; i--)
                {
        narisi_vrstico(sredina,i);
    }


 }
}
