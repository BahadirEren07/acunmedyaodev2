//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        int[] sayilar = new int[10];
        int toplam = 0;

        System.out.println("Lutfen 10 adet tam sayi giriniz:");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". sayi: ");
            sayilar[i] = scanner.nextInt();
            toplam += sayilar[i];
        }

        double ortalama = (double) toplam / sayilar.length;
        System.out.println("Dizinin ortalamasi: " + ortalama);

        System.out.println("50’den buyuk olan elemanlar:");
        int i = 0;
        while (i < sayilar.length) {
            if (sayilar[i] > 50) {
                System.out.print(sayilar[i] + " ");
            }
            i++;
        }
    }


    }
