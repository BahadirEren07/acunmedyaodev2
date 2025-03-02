import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> sayilar = new ArrayList<>();


        System.out.println("10 adet sayi gir:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Sayi " + (i + 1) + ": ");
            int num = scanner.nextInt();
            sayilar.add(num);
        }


        Collections.sort(sayilar, Collections.reverseOrder());


        System.out.println(" buyukten kucuge siralanmis:");
        for (int num : sayilar) {
            System.out.println(num);
        }
    }
}
