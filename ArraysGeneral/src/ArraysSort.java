import java.util.Arrays;
import java.util.Scanner;

public class ArraysSort {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Length of array: ");
        int n = input.nextInt();

        int[] list = new int[n];
        System.out.print("Members of array: \n");
        for (int i = 0;i<list.length;i++){
            System.out.print((i+1)+". number:  ");
            int temp = input.nextInt();
            list[i] = temp;
        }
        Arrays.sort(list);
        System.out.print("Order: " + Arrays.toString(list));

    }
}
