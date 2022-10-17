package problems;

import java.util.HashMap;

//https://leetcode.com/problems/encode-and-decode-tinyurl/
public class URLShortner {
    HashMap<String ,String> urlTable = new HashMap<>(); // store the encoded and decoded url resp.

    // Encodes a shortened URL to its original URL.
    String encode(String url) {
        // create a tinyurl
        String tinyurl = "https://www.tinyurl.com/"+getRandomCode();
        urlTable.put(tinyurl,url);
        return tinyurl;
    }

    // create a fixed sized random code
    String getRandomCode(){
        // Store the code
        StringBuilder builder = new StringBuilder();
        // create a code of length 13
        int codeLength = 13;
        // used to get random chars to creat a string
        String charStore = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

        // pick the random index upto codeLength time
        for (int i = 0; i < codeLength; i++) {
            int index = (int) (charStore.length()*Math.random());
            builder.append(charStore.charAt(index));
        }

        return builder.toString(); // return the built code
    }

    // Decodes a shortened URL to its original URL.
    String decode(String url) {
        if (urlTable.containsKey(url))
            return urlTable.get(url);
        return "URL is not valid!";
    }

    public static void main(String[] args) {
        String url = "https://leetcode.com/problems/design-tinyurl";
        URLShortner urlShortner = new URLShortner();
        String encoded = urlShortner.encode(url);
        String decoded = urlShortner.decode(encoded);

        System.out.println("Original url: "+url);
        System.out.println("Encoded url: "+encoded);
        System.out.println("Decoded url: "+decoded);
    }
}
