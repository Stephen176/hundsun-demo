package com.wz.demo;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        Object remove = map.remove("123");
        System.out.println((Boolean) remove);
    }
}
