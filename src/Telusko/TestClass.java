package Telusko;

public class TestClass extends AbstractKeyword {

    public void drive(){

    }

    public static void main(String[] args) {
        AbstractKeyword obj = new AbstractKeyword() {
            @Override
            public void drive() {
                System.out.println("drive now");
            }
        };
    }
}
