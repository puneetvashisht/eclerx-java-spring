package com.eclerx.day3;

import java.util.Comparator;

public class ColorComparator implements Comparator<Fruit>{

    @Override
    public int compare(Fruit o1, Fruit o2) {
        return o2.color.compareTo(o1.color);
    }
    
}
