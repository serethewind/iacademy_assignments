package Telusko;

import javax.crypto.spec.PSource;

public abstract class AbstractKeyword {

    /***
     * the abstract method is so that a method is created but it is not defined.
     * for a method to be rendered abstract. the class it belongs to must be made abstract
     *in this case, you cannot instantiate i.e. create the object of an abstract class in another class by the default way.
     * Usually, when this abstract class is extended by another class, the abstract method cannot be properly defined in the new class.
     *
     */
    public abstract void drive();

    public void playMusic(){
        System.out.println("play music");
    }

    public static void main(String[] args) {
        AbstractKeyword obj = new AbstractKeyword();
        obj.drive();
        obj.playMusic();
    }

}
