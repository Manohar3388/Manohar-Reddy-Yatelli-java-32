package day5;

import java.util.Arrays;

public class anagram {
    public static void areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            System.out.println("The strings are not anagrams");
        }
        else {
            char[] charArray1 = str1.toLowerCase().toCharArray();
            char[] charArray2 = str2.toLowerCase().toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            if (Arrays.equals(charArray1, charArray2)) {
                System.out.println("The strings are anagrams");

            } else {
                System.out.println("The strings are not anagrams");
            }
        }
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        areAnagrams(str1,str2);

    }
}
