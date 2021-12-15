import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args)
    {
        int mat, fiz, kimya, tur, tarih, muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz: ");
        fiz = inp.nextInt();
        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();
        System.out.print("Türkçe Notunuz: ");
        tur = inp.nextInt();
        System.out.print("Tarih Notunuz: ");
        tarih = inp.nextInt();
        System.out.print("Muzik Notunuz: ");
        muzik = inp.nextInt();

        int toplam = (mat + fiz + kimya + tur + tarih + muzik);

        double sonuc = toplam /6;
        System.out.print("Ortalama Notunuz: "+sonuc);
    }
}