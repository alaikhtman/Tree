/**
 * Created by Student on 29.05.2015.
 */
public class Main

{
    public static void main(String[] args)
    {


        Component category = new Node("A:");
        Component subCategory1 = new Node("B:");
        Component subCategory2 = new Node("C:");

        Component iphone = new Leaf("-D");
        Component ipad = new Leaf("-E");
        Component blackberry = new Leaf("-F");

        category.add (subCategory1);
        category.add(subCategory2);


        subCategory1.add(iphone);
        subCategory2.add(ipad);
        subCategory2.add(blackberry);


        category.print();
    }
}
