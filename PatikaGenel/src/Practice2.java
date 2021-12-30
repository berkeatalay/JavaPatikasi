import java.util.Scanner;

public class Practice2
{
    public static void main(String[] args) {

        double tutar, kdvOran= 0.18;
        Scanner input = new Scanner(System.in);
        System.out.print("Ucret Tutarini Giriniz: ");
        tutar = input.nextDouble();
        if (tutar >=1000){kdvOran = 0.08;}
        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar + kdvTutar;
        System.out.println(kdvliTutar);
    }
}
