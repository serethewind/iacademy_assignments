package PracticeToday;

public class Strings {
    public static void main(String[] args) {
        String name = "   iacademy  ";
        String anotherWay = new String("iacademy");
        System.out.println(name == anotherWay);
        System.out.println(name.equals(anotherWay));

        System.out.println(name.trim());
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(anotherWay.length());
        System.out.println(anotherWay.charAt(2));
        System.out.println(anotherWay.substring(1, 4));

        for (int i = 0; i < anotherWay.length(); i++){
            System.out.println(anotherWay.charAt(i));
        }


    }
}
