package org.November10th2023;

public class ReverseString {
    static void reverse(String str)
    {
        if ((str==null)||(str.length() <= 1))
            System.out.println(str);
        else
        {System.out.print(str.charAt(str.length()-1));
            reverse(str.substring(0,str.length()-1));
        }
    }
    public static void main(String[] args) {
        String str  =  "Abcdefgh";
        System.out.println("Original string: "+str);
        System.out.print("Reversed string: ");
        reverse(str);
    }
}
