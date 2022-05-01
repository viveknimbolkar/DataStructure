import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Temp t = new Temp();
        Scanner sc = new Scanner(System.in);
        int tcase = sc.nextInt();

        for (int i = 0; i < tcase; i++) {
            int arrSize = sc.nextInt();
            String[] arr = new String[arrSize];

            for (int j = 0; j < arrSize; j++) {
                arr[j] = sc.nextLine();
            }

            int maxLen = 0;

            int result = t.maxLengthString(arr, 0, arrSize,"", maxLen);
            System.out.println("Max Length: "+result);
            sc.next();
        }

    }

    int maxLengthString(String[] arr, int index, int N, String str, int maxLen){
        // Checking the string
        if (index == N) {
            return 0;
        }

        // Dont Include the string
        maxLengthString(arr, index + 1, N, str, maxLen);

        // Include the string
        str += arr[index];

        if(isValid(str)) {
            if(str.length() > maxLen) {
                maxLen = str.length();
            }
        }
        maxLengthString(arr, index + 1, N, str, maxLen);

        return maxLen;
    }

    boolean isValid(String str){
        int[] freq = new int[26];

        for (int i = 0; i < freq.length-1; i++)
            freq[i] = 0;


        // Store the frequency of each character
        for (int i = 0; i < str.length(); i++)
        {
            freq[str.charAt(i) - 'a']++;
        }


        // Check if the frequency of any character is odd, return false
        for (int i = 0; i < 26; i++)
        {
            if (freq[i] % 2 == 1)
            {
                return false;
            }
        }

        return true;
    }
}