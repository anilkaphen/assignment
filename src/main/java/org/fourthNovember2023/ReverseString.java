package org.fourthNovember2023;

public class ReverseString {
    public static void main(String[] args) {

        substringCount("aa bb cc dd ee aa mm nn ss","aa");
    }



    private static void substringCount(String input, String substing)
    {
         String arr[] = input.split(" ");
         int count=0;
         for(String str:arr){
         if(str.equals(substing))
         {
         count++;
        } }
         System.out.println(count);
         }
    }