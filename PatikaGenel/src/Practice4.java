import java.util.Scanner;

public class Practice4
{
    public static void main(String[] args) {
        int km;
        double perKm = 2.20,total, startPrice = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi Km olarak giriniz: ");
        km = input.nextInt();

        total = (km*perKm) + startPrice;

        total = (total <20) ? 20 : total;
        System.out.println("Toplam: " + total);

    }


}
