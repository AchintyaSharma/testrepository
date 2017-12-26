package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        long time = System.currentTimeMillis();
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        Integer s = 0;
        for (Integer n : ints) { s += n; }
        System.out.println(System.currentTimeMillis() - time);
    }
}
