package Searching;

import java.util.Arrays;

public class searchInStrings {
    public static void main(String[] args) {
        String name = "Yashraj";
        char target = 'j';
        System.out.println(search(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));//conversion of String to Array
    }
    static boolean search(String str, char target){
        if(str.length()==0){
            return false;
        } //length() is function in String class

        for(int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    static boolean search2(String str, char target){
        if(str.length()==0){
            return false;
        } //length() is function in String class

        for(char ch : str.toCharArray()) {
            if(ch == target){
                return true;
            } //to use for each loop u need array hence to convert string to array we use toCharArray()
        }
        return false;
    }
}
 