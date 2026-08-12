package OOPSC26CS070;

import java.util.Vector;

public class VectorFruitDisplay
{
    public static void main(String[] args)
    {
        Vector<String> fruits = new Vector<String>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");

        for(String fruit : fruits)
        {
            System.out.println(fruit);
        }
    }
}
