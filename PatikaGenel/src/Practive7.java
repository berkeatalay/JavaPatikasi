import java.util.Scanner;

public class Practive7 {
    public static void main(String[] args) {
        Double Armut,Elma,Domates,Muz,Patlican,total;
        int ArmutKg,ElmaKg,DomatesKg,MuzKg,PatlicanKg;

        Scanner input = new Scanner(System.in);

        Armut = 2.14;
        Elma = 3.67;
        Domates = 1.11;
        Muz= 0.95;
        Patlican = 5.00;

        System.out.print("Armut: ");
        ArmutKg = input.nextInt();
        System.out.print("Elma: ");
        ElmaKg = input.nextInt();
        System.out.print("ArmutDomates: ");
        DomatesKg = input.nextInt();
        System.out.print("ArmutMuz: ");
        MuzKg = input.nextInt();
        System.out.print("ArmutPatlican: ");
        PatlicanKg = input.nextInt();

        total= Armut*ArmutKg+Elma*ElmaKg+Domates*DomatesKg+Muz*MuzKg+Patlican*PatlicanKg;

        System.out.println("Toplam: " + total + " TL");




    }
}
