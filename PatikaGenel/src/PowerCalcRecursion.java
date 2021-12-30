import java.util.Scanner;

public class PowerCalcRecursion {

    static int power(int base,int power) {
        if(power ==0) return 1;
        if(power ==1) return base;
        else return base*power(base,power-1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int power = scan.nextInt();

        System.out.println("Sonuç : " + power(base,power));



    }
}
