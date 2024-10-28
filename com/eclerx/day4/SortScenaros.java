package com.eclerx.day4;
import java.util.*;

public class SortScenaros {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-9, -18, 0, 454,5, 45, 43);

        Optional<Integer> maxFound = list.stream()
        .max(Integer::compare);

        if(maxFound.isPresent()){
            System.out.println(maxFound.get());
        }


       
    }
}
