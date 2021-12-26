import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Double boy, index;
        int kilo;

        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuz (m): ");
        boy = input.nextDouble();
        System.out.print("Kilonuz (kg): ");
        kilo = input.nextInt();

        index = kilo/(boy*boy);
        System.out.println("Vucut kitle indexinix: " + index);

    }
}
