//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> sayilar = new ArrayList<>();


        sayilar.add(31);
        sayilar.add(32);
        sayilar.add(77);
        sayilar.add(89);
        sayilar.add(91);
        sayilar.add(99);
        sayilar.add(11);
        sayilar.add(12);
        sayilar.add(5);
        sayilar.add(45);


        int buyuk = Collections.max(sayilar);
        int kucuk = Collections.min(sayilar);


        System.out.println("En buyuk : " + buyuk);
        System.out.println("En kucuk : " + kucuk);
    }
}
