import java.util.Scanner;

public class PatternRecursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        Pattern(n,true,0);
    }

    static void Pattern(int n,boolean isDecreasing,int count) {
        if(isDecreasing){
            System.out.print(n + " ");
            if (n-5 <=0) {
                isDecreasing = false;
            }
            Pattern(n-5,isDecreasing,count+1);
        } else {
            System.out.print(n + " ");
            if(count==0) return;
            Pattern(n+5,isDecreasing,count-1);

        }
    }
}
