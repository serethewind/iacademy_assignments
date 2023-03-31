package Telusko;

import java.util.Objects;

public class ObjectInbuilt {
    String model;
    int price;

    @Override
    public String toString() { //java generated toString() method
        return "ObjectInbuilt{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ObjectInbuilt that)) return false;
        return price == that.price && Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }

    public boolean equals(ObjectInbuilt that){
        //we compare the instance variables - string and the price which is an int
        return (this.model.equals(that.model) && this.price == that.price);
    }





    /**
     * some inbuilt methods of objects such as
     * equals, toString()
     * the inbuilt method of toString() will print the className concatenated with the hashCode
     * the equals model compares the obj to the this.obj
     * we can method override such that we specify different
     * outcomes for these inbuilt methods
     * it is recommended to allow java generate our own inbuilt equal and hashCode method
     *
     * @param args
     */
    public static void main(String[] args) {

    }
}
