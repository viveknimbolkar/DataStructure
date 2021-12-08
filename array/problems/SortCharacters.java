package array.problems;

public class SortCharacters {

    int partation(String str, int low, int high){
        int pivot = str.charAt(high);
        int i = (low-1);

        for (int j = low; j < high-1; j++) {
            if(str.charAt(i) < pivot){
                i++;
            }
        }

        return i+1;
    }

    //applying quicksort
    void sortChars(String str, int low,int high){
        if(low<high){
            int partation = partation(str,low,high);
            sortChars(str,low,partation-1);
        }
    }

    public static void main(String[] args) {
        SortCharacters sortchar = new SortCharacters();
        String str = "bcdaefkzyop";
        sortchar.sortChars(str,0,str.length());

    }
}
