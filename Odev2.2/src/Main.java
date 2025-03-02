//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int[] sayi={3,8,2,3,1,5,2};
        for (int i = 0; i <sayi.length; i++) {
            for (int j = i+1 ; j < sayi.length; j++) {
                if (sayi[i]==sayi[j]){
                    System.out.print(sayi[i]+" ");
                    break;
                }
            }
        }
    }
}