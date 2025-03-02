import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7};

        // 1. Arrays.sort(): Diziyi küçükten büyüğe sıralar.
        Arrays.sort(numbers);
        System.out.println("Sıralı dizi: " + Arrays.toString(numbers));

        // 2. Arrays.binarySearch(): Sıralı dizide elemanın indeksini bulur.
        int index = Arrays.binarySearch(numbers, 7);
        System.out.println("7'nin indeksi: " + index);

        // 3. Arrays.copyOfRange(): Belirtilen aralıktaki elemanları kopyalar.
        int[] subArray = Arrays.copyOfRange(numbers, 1, 4);
        System.out.println("Kopyalanan aralık: " + Arrays.toString(subArray));

        // 4. Arrays.equals(): İki dizinin eşit olup olmadığını kontrol eder.
        int[] otherNumbers = {1, 2, 5, 7, 9};
        System.out.println("Diziler eşit mi? " + Arrays.equals(numbers, otherNumbers));

        // 5. Arrays.fill(): Diziyi belirli bir değerle doldurur.
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 3);
        System.out.println("Doldurulmuş dizi: " + Arrays.toString(filledArray));

    }
}