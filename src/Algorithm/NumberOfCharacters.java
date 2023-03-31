package Algorithm;

public class NumberOfCharacters {
    /**
     * 1. Write a method that determines the number of times a given character appears in a string.
     *
     * make all the letters ignore case
     *
     * Method should take in the string and the given character
     * when comparing, let the first instance of the character be recorded.
     * if the character appears in the others, let the character instance be updated
     *
     * @param
     */

    public static int numberOfCharacters(String fullString, char character) {
        String str = fullString.toLowerCase();
        String charToString = String.valueOf(character).toLowerCase();

        int charCount = 0;
        for (int i = 0; i < str.length(); i++){
            char characterBeingChecked = str.charAt(i); //character being checked
            String remCharacters = str.substring(i+1); //other characters

//            if (remCharacters.contains(String.valueOf(characterBeingChecked))){
//               charCount = charCount + 1;
//               return charCount;
//           } else
//            {
//             return charCount;
//            }

            while (remCharacters.contains(String.valueOf(characterBeingChecked))){
                charCount = charCount + 1;
                remCharacters = remCharacters.substring(0, remCharacters.indexOf(characterBeingChecked)) +
                        remCharacters.substring(remCharacters.indexOf(characterBeingChecked) + 1);
            }
        }

        return charCount;
        }



//        public static int numberOfCharacters(String fullString, char character) {
//            String str = fullString.toLowerCase();
//            String charToString = String.valueOf(character).toLowerCase();
//            int charCount = 0;
//            for (int i = 0; i < str.length(); i++) {
//                char characterBeingChecked = str.charAt(i);
//                if (charToString.equals(String.valueOf(characterBeingChecked))) {
//                    charCount++;
//                }
//            }
//            return charCount;
//        }


//        public static int countOccurrences(String str, char ch) {
//            int count = 0;
//            for (int i = 0; i < str.length(); i++) {
//                if (str.charAt(i) == ch) {
//                    count++;
//                }
//            }
//            return count;
//        }



    public static void main(String[] args) {
        System.out.println(numberOfCharacters("noahh", 'y'));
    }

}
