package com.eclerx.day2;

public class StringDemo {
    public static void main(String[] args) {
        // String str = new String("abc");
        String str = "abc";
        String str1 = "abc";
        String returnStr = str.concat("def");
        System.out.println(returnStr);

        if(str == str1){
            System.out.println("Same references");
        }
        if(str.equals(str1)){
            System.out.println("Equal");
        }

        StringBuffer sb = new StringBuffer();
        for(int i=0; i<10000; i++){
            // str += i;
            sb.append(i);
        }
        System.out.println(sb.toString());
    }
}
