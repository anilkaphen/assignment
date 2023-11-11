package org.November10th2023;

public class CountChar {
    public static void main(String[] args) {
        subStringCount("india","i");

    }
    public static void subStringCount(String req, String req2){
        String arr[]= req.split("");
        int count=0;
        for(String str:arr){
            if (str==req2){
                count++;
            }

        }
        System.out.println(count);
    }

}
