package array.string;
//https://leetcode.com/problems/capitalize-the-title/
public class CapitalizeTheTitle {

    String capitalizeTitle(String title) {
        StringBuilder capatilizedTitle = new StringBuilder();
        String[] wordList = title.split("");


        return "vivek";
    }

    public static void main(String[] args) {
        CapitalizeTheTitle cap = new CapitalizeTheTitle();
        String title = "capiTalIze tHe titLe";
        System.out.println(cap.capitalizeTitle(title));
    }
}
