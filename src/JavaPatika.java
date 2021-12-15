import java.util.Scanner;

public class JavaPatika {
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);

        String adSoyad = inp.nextLine();

        int yas = inp.nextInt();
        double maas = inp.nextDouble();

        // Çıktılar
        System.out.println("Ad Soyad: " + adSoyad);
        System.out.println("Yaş : " + yas);
        System.out.println("Maaş : " + maas);
    }
}


