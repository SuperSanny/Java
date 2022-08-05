import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(24);
        list.add(54);
        
        System.out.print(list);
        System.out.println(list.contains(12));
        System.out.println(list.clone());

        list.set(1, 99);
        list.remove(0);
        System.out.println(list);
    }
}
