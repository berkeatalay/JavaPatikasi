import java.util.Scanner;

public class CalculatorWithSwitch {
    public static void main(String[] args) {
        int n1,n2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("First number: ");
        n1 = input.nextInt();
        System.out.print("Second number: ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-bolme ");
        System.out.print("Choice: ");
        select =input.nextInt();

        switch (select) {
            case 1:
                System.out.print("Sum: "+ (n1+n2));
                break;
            case 2:
                System.out.print("Subs: "+ (n1-n2));
                break;
            case 3:
                System.out.print("Mult: "+ (n1*n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.print("0 cannot divide");
                } else {
                    System.out.print("Div: " + (n1 / n2));
                }
                break;
            default:
                System.out.print("Wrong Choice");

        }
    }
}
