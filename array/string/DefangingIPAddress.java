package array.string;
// https://leetcode.com/problems/defanging-an-ip-address/
public class DefangingIPAddress {

    String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }

    public static void main(String[] args) {
        DefangingIPAddress defang = new DefangingIPAddress();
        String address = "1.1.1.1";
        System.out.println(defang.defangIPaddr(address));
    }
}
