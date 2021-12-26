import java.util.Scanner;

public class Practice5
{
    public static void main(String[] args) {
        int r, a;
        double alan ,cevre, parca, pi=3.14 ;

        Scanner input = new Scanner(System.in);
        System.out.print("Yaricap: ");
        r = input.nextInt();
        System.out.print("Aci: ");
        a = input.nextInt();

        alan = 2 * pi * r;
        cevre = r * pi * r;

        parca = (pi *r*r*a)/360;

        System.out.println("Alan: " + alan);
        System.out.println("cevre: " + cevre);
        System.out.println("parca: " + parca);
    }
}
