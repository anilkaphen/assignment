package org.november11th2023;

public class StringUtill1 {

    public static void main(String[] args) {
        StringUtill1 utill1 = new StringUtill1();
//        System.out.println(utill1.reversString("apple"));
//        System.out.println(utill1.charCount("Mango"));
//        System.out.println(utill1.wordCount("one two three"));

//        for(String s: utill1.getWordArray("five six seven")){
//            System.out.println(s);
//        }
        String s1 = "abc";
        String s2 = "abc";
        String s3 =  new String("abc");
        System.out.println( s1.hashCode());
        System.out.println( s3.hashCode());
        System.out.println(s1==s2);
        System.out.println(s1.equals(s3));
      //  System.out.println(s3.substring(1).);




    }

    public int charCount( String str){

        int i=0;
        while (i<str.length()){
            i ++;

        }
        return i ;
    }
    public String reversString(String str){
        String res = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            res = res + str.charAt(i);
        }
        return res;
    }

    public int wordCount(String str){
        String res = "";
      int  count =0;
        for (int i =0; i>=str.length();i++ ){
            if(res.charAt(i) != ' ')
                count++;
        }
        return count;
    }
    public String[] getWordReverse(String str){
        return   str.split(" ");
    }
    public String[] getWordArray(String str){
      return   str.split(" ");

       /*
        String res = "";
        int count=0;
        String[] word = new String[];
        char ch []= new char[str.length()];
        for (int i =0; i<=str.length();i++ ){
          //  if(str.)
            ch[i]=str.charAt(i);
            if ((i>0) && (ch[i-1]))
                count++;
        }
        return count;

        */
    }

}


