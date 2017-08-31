package Mentoring_practice;


import java.util.ArrayList;

public class Use_ArrayList {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();

        //All optional operations including adding, removing, and replacing
        // elements are supported. This class is a good
        // choice as your default List implementation.For example :-

        // add some elements
        a.add("Name");// index 0
        a.add("age");// index 1
        a.add("DOB"); //2
        a.add("Status"); //3
        a.add("Country");
        a.add("Language");
        a.add("StsteName");
        System.out.println( a);

        //remove elements
        a.remove(2);
        //System.out.println(a);

        // add new elements.
        a.add(2,"Job");
        a.add("Style");
       // System.out.println(a);


    }
}
