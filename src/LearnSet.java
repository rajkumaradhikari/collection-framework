import java.util.HashSet;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(5);
        set.add(51);
        set.add(15);
        set.add(25);

        System.out.println(set);

        set.remove(5);

        System.out.println(set);

        System.out.println(set.contains(15));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();

        System.out.println(set);


    }
}
