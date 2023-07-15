import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        
        //This is SIMILAR to vectors in C++
        /*When you cannot specify the size of array.....you dont know how many inputs your array is
        goona take then u use ARRAYLIST*/


        //Syntax
        // ArrayList <Data Type> variable = new ArrayList<>(initialCapacity);

        ArrayList<Integer> list = new ArrayList<>(5); 
        //ArrayList is a class and here we create a object named list of int data Type
        list.add(1);
        list.add(3);
        list.add(34);
        list.add(66);
        list.add(143);
        list.add(371);
        //initial capacity was of 5 elements but this been ArrayLists size is not specified hence you can add as many elements you required
        System.out.println(list);
        System.out.println(list.contains(0));
        System.out.println(list.contains(1));

        list.set(0, 1111);
        System.out.println(list);
        System.out.println(list.isEmpty());

        list.remove(0);
        System.out.println(list);

    }
}
