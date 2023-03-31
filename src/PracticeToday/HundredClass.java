package PracticeToday;

public class HundredClass {

    public void evenClass(){
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

    }

    public void oddClass(){
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
       HundredClass testClass = new HundredClass();
       testClass.evenClass();
       testClass.oddClass();
    }
}

