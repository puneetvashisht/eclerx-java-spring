package com.eclerx.day1;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        // int student1Score = 34;

        int scores[] = {33,56,776,23,2,232,1,121,211,11};
        // System.out.println(scores[scores.length - 1]);

        // for(int i = 0; i <= scores.length ; i++){
        //     System.out.println(scores[i]);
        // }

        // enhanced for loop
        int totalScore = 0;
        // int maxScore = 0;
       

        Arrays.sort(scores);
        System.out.println(scores);


        for(int score: scores){
            System.out.println(score);
            totalScore += score;
        }
        System.out.println("Max Score" + scores[scores.length -1 ]);
        System.out.println("Average " + (totalScore/scores.length));
    }
}
