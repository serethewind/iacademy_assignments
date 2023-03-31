package PracticeToday;

public class CompoundOperator {
    public static void main(String[] args) {
        int age = 50;
        System.out.println(age++);
        --age;
        System.out.println(--age);
        age++;
        System.out.println(age);

        int vAge = 20;
      String vNationality = "Nigerian";
      if (vAge >= 18 && vNationality.equalsIgnoreCase("nigerian")){
          System.out.println("You're eligible to vote");
      } else {
          System.out.println("You're not eligible to vote");
      }
    }
}
