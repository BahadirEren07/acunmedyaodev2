//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> sayilar = new ArrayList<>();
        ArrayList<Integer> ciftsayilar = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int sayi = random.nextInt(100) + 1;
            sayilar.add(sayi);
        }

        for (int sayi : sayilar) {
            if (sayi % 2 == 0) {
                ciftsayilar.add(sayi);
            }
        }

        System.out.println("Cift Sayilar:");
        for (int sayi : ciftsayilar) {
            System.out.println(sayi);
        }
    }
}
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

