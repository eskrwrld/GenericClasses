import Arithmetic.*;
import Map.*;
public class Main {
    public static void main(String[] args) {
        //Arithmetic
        Arithmetic<Integer, Double> arithmetic = new Arithmetic<>(50, 30.5);
        System.out.println("Add: " + arithmetic.add());
        System.out.println("Subtract: " + arithmetic.subtract());
        System.out.println("Multiply: " + arithmetic.multiply());
        System.out.println("Divide: " + arithmetic.divide());
        System.out.println("Min: " + arithmetic.getMin());
        System.out.println("Max: " + arithmetic.getMax());

        //MyMap
        MyMap<String, Integer> myMap = new MyMap();
        myMap.put("HELLO", 10);
        myMap.put("Crush", 20);

        System.out.println("Value for key 1: " + myMap.get("HELLO"));
        System.out.println("Value for key 2: " + myMap.get("Crush"));
        System.out.println("Remove for key 1: " + myMap.remove("HELLO"));
        System.out.println("Remove for key 2: " + myMap.remove("Crush"));
    }
}