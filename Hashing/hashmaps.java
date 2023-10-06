package Hashing;

import java.util.HashMap;

public class hashmaps {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 100);
        map.put("US", 90);
        map.put("UK", 80);
        map.put("China", 100);

        System.out.println(map);
    }
}