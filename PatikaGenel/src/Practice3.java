import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        int a,b;
        double c;

        Scanner input = new Scanner(System.in);
        System.out.print("1. Kenar: ");
        a = input.nextInt();
        System.out.print("2. Kenar: ");
        b = input.nextInt();

        c = Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenus: " + c);

        double yaricevre = (a+b+c)/2;
        double alan = Math.sqrt(yaricevre * (yaricevre-a)* (yaricevre-b)* (yaricevre-c));
        System.out.println("Alan: " + alan);
    }
}
