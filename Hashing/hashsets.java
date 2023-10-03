package Hashing;

import java.util.HashSet;

public class hashsets {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);

        System.out.println(set);

        set.remove(1);

        System.out.println(set);

        boolean x = set.contains(4);

        System.out.println(x);
    }
}
