package day12;

import java.util.ArrayList;
import java.util.List;
public class ArrayListExample {
    public static void main(String[] args)  {
        ArrayList list1 =new ArrayList();     // syntax to define Array List
//        ArrayList <Integer> list1 = new ArrayList <Integer> ();
        {
            list1.add("apple");
            list1.add("ball");
            list1.add('a');
            list1.add(10);
            list1.add(11);}

        System.out.println(list1);        // to get the values for array

        list1.remove(3);
        list1.remove("ball");
        System.out.println(list1);        // get values after removal of an element
        System.out.println(list1.size());// Length of an array list
        list1.add(1, 33);
        System.out.println(list1);

        for (Object i : list1){
            System.out.print(i+ " / ");
        }

        System.out.println();
        for (int b=0; b<list1.size();b++){
            Object c = list1.get(b);
            System.out.print(c+ " / ");
        }




    }
}
