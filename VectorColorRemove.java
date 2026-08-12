package OOPSC26CS070;

import java.util.Vector;

public class VectorColorRemove
{
    public static void main(String[] args)
    {
        Vector<String> colors = new Vector<String>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        colors.remove("Green");

        System.out.println(colors);
    }
}
