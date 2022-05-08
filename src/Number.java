import java.io.*;
import java.util.*;

public class Number {
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(77);
        list.add(89);
        list.add(32);
        list.add(100);
        list.add(13);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        list.add(3, 66);
        System.out.println(list);
        list.add(5, -8);
        System.out.println(list);
        list.remove(0);
        list.remove(1);
        System.out.println(list);
    }
}
