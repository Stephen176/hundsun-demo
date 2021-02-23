package com.wz.demo;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListTest {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        integers.add(5);
        for (Integer integer : integers) {
            System.out.println(integer);
        }

    }
}
