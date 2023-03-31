package Telusko;

public class WrapperClasses {
    /**
     * data types like the primitive types e.g. int, char do not extend the object class
     * however data types have their corresponding wrapper class objects
     */

    public static void main(String[] args) {
        int num = 7; //primitive data type
        Integer num1 = 8; //wrapper class for the corresponding type

        num1 = num; //boxing - the art of converting the primitive type into the corresponding wrapper class object. this is now automatic, auto-boxing

        int num2 = num1; //auto-unboxing. converting the Wrapper class object to a primitive data type

        /**
         * the Integer class has a method that allows convert int in strings to actual int by assigning it to an int reference variable. We can now perform mathematical calculations on the number.
         */

        String str = "12";
        int num3 = Integer.parseInt(str);
        System.out.println(num3 * 5);


        System.out.println(num2);
    }
}
