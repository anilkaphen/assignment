package org.November10th2023;

public class CountOfChar {
/*
    public static void main(String[] args) {
        countChars("aa bb cc dd cc bb aa",'c');

    }
    public static int countChars(String s, char c) {
        if (s.length() == 0)
            return 0;
        else if (s.charAt(0) == c)
            return 1 + countChars(s.substring(1), c);
        else
            return countChars(s.substring(1), c);
    }

 */
public static void main(String args[]){
    String str1 = "aa bb cc aa cc cc bb aa", str2 = "aa";
    System.out.println("Count of substring: "+subsrting_rec(str1, str2));
}
    static int subsrting_rec(String str, String sub){
        if (str.contains(sub)){
            return 1 + subsrting_rec(str.replaceFirst(sub, ""), sub);
        }
        return 0;
    }

}
