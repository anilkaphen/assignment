package org;

public class StringUtil {
    public static void main(String[] args) {
        //palindrome("madam");
        //substringCount("aa bb cc dd ee aa mm nn ss bb bb", "bb");
        String a="abc";
        String b=new String("abc");
        System.out.println(a.equals(b));

    }
    private static void substringCount(String input, String substing) {
        //
        String arr[] = input.split(" ");
        int count=0;
        for(String str:arr){
            if(str.equals(substing)) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static void palindrome(String s) {
        String r="";
        char []a = s.toCharArray();
        for(int i=a.length-1;i>=0;--i){
           r=r+String.valueOf(a[i]);
        }

        if(s.equals(r)){
            System.out.println("Palindrome");
        } else {
            System.out.println("not Palindrome");
        }
    }
}
