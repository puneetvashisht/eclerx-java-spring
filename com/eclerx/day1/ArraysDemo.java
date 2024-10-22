package com.eclerx.day1;

public class ArraysDemo {
    public static void main(String[] args) {
        // int student1Score = 34;

        int scores[] = {33,56,776,23,2,232,1,121,211,11};
        System.out.println(scores[scores.length - 1]);

        // for(int i = 0; i <= scores.length ; i++){
        //     System.out.println(scores[i]);
        // }

        // enhanced for loop
        for(int score: scores){
            System.out.println(score);
        }
    }
}
