//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] sayilar = {4, -2, 9, -5, 3, -4, 7};
        int pozitif = 0;
        int negatif = 0;

        for (int sayi : sayilar) {
            if (sayi > 0) {
                pozitif += sayi;
            } else {
                negatif += sayi;
            }
        }

        System.out.println("pozitif toplam : " + pozitif);
        System.out.println("negatif toplam : " + negatif);



    }
}