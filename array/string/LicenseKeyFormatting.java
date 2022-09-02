package array.string;
//https://leetcode.com/problems/license-key-formatting/
public class LicenseKeyFormatting {

    String licenseKeyFormatting(String s, int k) {
        if(s == null || s.equals("")) return "";
        // remove the dash and convert string into uppercase
        s = s.replaceAll("-","").toUpperCase();
        int count = 0;
        StringBuilder ans = new StringBuilder();

        // build a string by reverse traversing
        for (int i = s.length()-1; i >=0 ; i--) {
            ans.append(s.charAt(i));
            count++;
            if (i != 0 && count == k){
                ans.append("-");
                count = 0;
            }
        }
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        LicenseKeyFormatting licence = new LicenseKeyFormatting();
        String s = "5F3Z-2e-9-w";
        int k = 4;
        System.out.println(licence.licenseKeyFormatting(s,k));
    }
}
