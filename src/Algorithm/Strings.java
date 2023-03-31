package Algorithm;

import java.util.Arrays;

public class Strings {

    /**
     * implement an algorithm to determine if a string has all uniqeu charactes. what if you cannot use additional data structures?
     * @param str
     * @return
     */
    public static boolean isUnique(String inputStr) {
        String str = inputStr.toLowerCase();
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }

        for (int i = 0; i < str.length(); i++) {
            char characterBeingChecked = str.charAt(i);
            String restOfCharacters = str.substring(i + 1);
            int locationOfCharacter = restOfCharacters.indexOf(characterBeingChecked);

            if (locationOfCharacter != -1) { //indexOf method
                return false;
            }

            if (restOfCharacters.contains(String.valueOf(characterBeingChecked))){ //contains method
                return false;
            }

        }
            return true;
    }

    public static boolean isUniqueUsingContains (String inputStr){
        String str = inputStr.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char characterBeingChecked = str.charAt(i);
            String restOfCharacters = str.substring(i + 1);

//            restOfCharacters.contains(characterBeingChecked);
            if (restOfCharacters.contains(String.valueOf(characterBeingChecked))){ //contains method
                return false;
            }
        }
        return true;
    }

    public static boolean isUniqueUsingStringArray (String inputStr){
        String str = inputStr.toLowerCase();
        /**
         * convert string to character Array
         * sort the array using a custom method
         */

        char[] strArray = str.toCharArray();
        Arrays.sort(strArray);
        for (int i = 0; i < strArray.length - 1; i++){
            if (strArray[i] == strArray[i+1]){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isUnique("chidnma"));
        System.out.println(isUniqueUsingStringArray("chidnma"));
        System.out.println(isUniqueUsingContains("chidnma"));
    }
}

