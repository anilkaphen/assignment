package org.november11th2023;
public class StringUtill {
    public static void main(String[] args) {
        StringUtill stringUtill = new StringUtill();
        substringCount("aa bb cc dd ee dd mm nn ss", "dd");
        stringUtill.palindrome("rotor");
        System.out.println(stringUtill.Charcount1("Apple ball"));
    }

    private static void substringCount(String input, String substing) {
        String arr[] = input.split(" ");
        int count = 0;
        for (String str : arr) {
            if (str.equals(substing)) {
                count++;
            }
        }
        System.out.println(count);
    }

    private void palindrome(String s) {
        String r = "";
        char[] a = s.toCharArray();
        for (int i = a.length - 1; i >= 0; --i) {
            r = r + String.valueOf(a[i]);
        }
        if (s.equals(r)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not Palindrome");
        }
    }

    public int Charcount1(String str) {
        int i = 0;
        while (i < str.length()) {
            i++;
        }
        return i;
    }
}




