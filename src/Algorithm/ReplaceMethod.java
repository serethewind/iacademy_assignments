package Algorithm;

import java.util.ArrayList;
import java.util.List;

public class ReplaceMethod {

    public static String replace(String str){
        String output = "";
        str = str.trim();
        char[] strToArray = str.toCharArray();
        List<String> arrayList = new ArrayList<>();

                for (int i = 0; i < strToArray.length; i++){

                    if (strToArray[i] == 32){
                       output+="%20";
                    }
                    output += strToArray[i];
                }
                return output;

    }

    public static String replaceArray (String str){
        char[] newStr = str.trim().toCharArray(); //convert str to array of characters
        List<String> arrayList = new ArrayList<>(); //create a dynamic array called arraylist
        for (int i = 0; i < newStr.length; i++){
            if (newStr[i] == ' '){
                arrayList.add("%20");
            }
           String newerStr = Character.toString(newStr[i]);
            arrayList.add(newerStr); //this adds all the content of the str passed into this method.
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++){
            result.append(arrayList.get(i));
        }
        return result.toString().replaceAll(" ", "");
    }

    public static String replaceALl (String str){
        return str.trim().replaceAll(" ", "%20");
    }



    public static void main(String[] args) {
        System.out.println(replace("Mr Noah Johnson"));
    }
}
