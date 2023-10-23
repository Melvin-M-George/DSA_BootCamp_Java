package com.melvin;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "melvin";
        char target = 'v';
        //System.out.println(search(name,target));
        System.out.println(search2(name,target));
    }

    static boolean search2(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for(char element : str.toCharArray()){
            if(element==target){
                return true;
            }
        }
        return false;
    }

    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for (int i = 0; i < str.length() ; i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
