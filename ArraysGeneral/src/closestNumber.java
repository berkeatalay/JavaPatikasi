import java.util.Arrays;
import java.util.Scanner;

public class closestNumber {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        int[] oldList = {15,12,788,1,-1,-778,2,0};

        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int number = input.nextInt();

        int minC =0;
        int maxC =0;

        Arrays.sort(list);
        for(int i : list){
            if (i<number)  minC=i;
            if (i>number) {
                maxC = i;
                break;
            }
        }
        System.out.println("Array: " + Arrays.toString(oldList));
        System.out.println("Entered Number: " + number);
        System.out.println("Closest smaller number: " + minC);
        System.out.println("Closest bigger number: " + maxC);
    }

}
