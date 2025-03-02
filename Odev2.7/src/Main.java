import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<>();
        sehirler.add("Istanbul");
        sehirler.add("Manisa");
        sehirler.add("Bilecik");
        sehirler.add("Samsun");
        sehirler.add("Canakkale");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sehir ismi giriniz: ");
        String girilensehir = scanner.nextLine();

        if (sehirler.contains(girilensehir)) {
            int indeks = sehirler.indexOf(girilensehir);
            System.out.println(girilensehir + " sehiri listede mevcut. Indeksi: " + indeks);
        } else {
            System.out.println(girilensehir + " sehiri listede bulunmamaktadır.");
        }
    }
}
