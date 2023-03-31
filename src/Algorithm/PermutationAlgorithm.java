package Algorithm;

import java.util.Arrays;

public class PermutationAlgorithm {
    public static boolean isPermutation(String str1, String str2){

        if (str1.length() != str2.length()){
            return false;
        }

       char[] stringArray1 = str1.toCharArray(); //convert the string to an array of individual strings called characters
       char[] stringArray2 = str2.toCharArray();
        Arrays.sort(stringArray1); //sort the array. we converted to array in the first place to tap into the sort method
        Arrays.sort(stringArray2);
       System.out.println(stringArray1);
       System.out.println(stringArray2);
//       Arrays.toString(name of the array) will convert the array back to the string which can now be compared
       return Arrays.toString(stringArray1).equalsIgnoreCase(Arrays.toString(stringArray2));

    }

    public static boolean isPermutationUsingHaskey (String inputStr1, String inputStr2){
        String str1 = inputStr1.toLowerCase();
        String str2 = inputStr2.toLowerCase();
        int result1 = 0;
        int result2 = 0;
        char[] stringArray1 = str1.toCharArray();
        char[] stringArray2 = str2.toCharArray();

        for (int i = 0; i < stringArray1.length; i++){
          result1 += stringArray1[i];
        }

        for (int i = 0; i < stringArray2.length; i++){
            result2 += stringArray2[i];
        }
        System.out.println(result1);
        System.out.println(result2);

        return result1==result2;
    }

    public static void main(String[] args) {
        System.out.println(isPermutation("sarah", "harAs"));
        System.out.println(isPermutationUsingHaskey("sarah", "sAraH"));
    }
}
