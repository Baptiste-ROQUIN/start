import java.util.List;
import java.util.ArrayList;
public class Executable {
    public static void main(String[] args) {
        List<Double> lesNotes = new ArrayList<>();
        lesNotes.add(11.80);
        lesNotes.add(12.);
        lesNotes.add(12.20);

        Double totalNote = 0.0;
        for (Double note : lesNotes) {
            totalNote += note;
        }
        Double avg = totalNote / lesNotes.size();
        System.out.println("La moyenne des notes est de : " + avg);

        int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        int[] intArray2 = new int[]{ 1,2,3,4,5,4,3,2,1 };
        System.out.println(listPalindrome(intArray));
        System.out.println(listPalindrome(intArray2));

    }

    public static boolean listPalindrome(int[] tab){
        for (int i=0; i< tab.length; i++){
            if (tab[i] != tab[tab.length-1-i]) return false;
        }
        return true;
    }
}
