import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(15);
        sayilar.add(25);
        sayilar.add(65);
        sayilar.add(75);
        sayilar.add(85);

        // get() - 2. elemani al ve kontrol et
        System.out.println("2. Indeksteki eleman: " + sayilar.get(2));

        // set() - 1. elemani degistir
        sayilar.set(1, 25);
        System.out.println("Liste setten sonra: " + sayilar);

        // remove() - 3. elemani cikart
        sayilar.remove(3);
        System.out.println("Liste removeden sonra: " + sayilar);

        // size() - Liste uzunlugunu kontrol et
        System.out.println("Liste size'i: " + sayilar.size());

        // clear() - Listeyi temizle, her seyi sil
        sayilar.clear();
        System.out.println("Liste after clear: " + sayilar);
    }
}
