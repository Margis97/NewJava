// Java program for reversing an arraylist
import java.io.*;
import java.util.*;
 
public class GFG2 {
    public static void main(String[] args)
    {
        // Declaring arraylist without any initial size
        ArrayList<Integer> arrayli = new ArrayList<Integer>();
 
        // Appending elements at the end of the list
        arrayli.add(new Integer(9));
        arrayli.add(new Integer(145));
        arrayli.add(new Integer(878));
        arrayli.add(new Integer(343));
        arrayli.add(new Integer(5));
        System.out.print("Elements before reversing: ");
        printElements(arrayli);
 
        // Collections.reverse method takes a list as a
        // parameter and reverses the passed parameter
      //(no new array list is required)
        Collections.reverse(arrayli);
        System.out.print("\nElements after reversing: ");
        printElements(arrayli);
    }
 
    // Iterate through all the elements and print
    public static void printElements(ArrayList<Integer> alist)
    {
        for (int i = 0; i < alist.size(); i++) {
            System.out.print(alist.get(i) + " ");
        }
    }
}