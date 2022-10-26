import java.util.Scanner;

public class SayiSirala {


    public static void main(int[] args) {


    Scanner SayiSirala = new Scanner(System.in);
    int sayilar;
    int [] dizi = new int[10];
        for (int i = 0; i<10; i++);
    {
        int i=0;
        System.out.println("Dizinin" + (i+1) + "Elemanını Giriniz");
        dizi [i]= SayiSirala.nextInt();
    }
       // {if (dizi[i] == dizi[i]);
       // System.out.println("Bu Sayıyı Daha Önce Girdiniz"+"Diğerlerinden Farklı bir Sayı Giriniz");
       // }

        System.out.println("Küçükten Büyüğe: \n" );
        for (int i = 0; i<9; i++);
        {
            int i=0;
            for (int k = i +1; k<10; k++)
            {
                if(dizi[k]< dizi[i]){
                    sayilar =dizi[i];
                    dizi[i]=dizi[k];
                    dizi[k]= sayilar;
                }
            }
        }
        int i;
        for (i = 0; i < 10; i++)
        {
            System.out.println("Dizinin" + (i+1)+ ".Elemanı:" + dizi[i]);
        }
    }
}
