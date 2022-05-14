package additional;
import java.util.ArrayList;
import java.util.List;



public class DemoList {
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(78);
        list.add(65);
        list.add(1, 1000);
        list.remove(0);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        List<String> list2 = new ArrayList<>();
        
    }
}
