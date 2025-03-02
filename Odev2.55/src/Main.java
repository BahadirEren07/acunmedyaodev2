//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        ArrayList<String> kelimeler = new ArrayList<>();


        System.out.println("10 kelime giriniz:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Kelime " + (i + 1) + ": ");
            String kelime = scanner.nextLine();
            kelimeler.add(kelime);
        }


        Collections.sort(kelimeler);


        System.out.println("Alfabetik sırayla sıralama:");
        for (String kelime : kelimeler) {
            System.out.println(kelime);
        }

    }
}