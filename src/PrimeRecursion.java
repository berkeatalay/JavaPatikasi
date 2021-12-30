import java.util.Scanner;

public class PrimeRecursion {

    static boolean isPrime(int number,int i) {
        if(number==2) return true;

        if(number%i==0) return false;

        if(i*i>number) return true;

        return isPrime(number,i+1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();

        if(isPrime(n,2)) {
            System.out.println(n + " bir asal sayidir");
        } else {
            System.out.println(n + " bir asal sayi degildir");
        }
    }
}
