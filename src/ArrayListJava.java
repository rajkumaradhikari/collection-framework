import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListJava {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println(list);


        for (int i = 0;i<list.size();i++){
            System.out.println("Using for loop "+list.get(i));
        }

        System.out.println("========Output using foreach loop ===========");

        for (Integer output : list){
            System.out.println(output);
        }

        System.out.println("========Output using Iterator ===========");

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println("Using Iterator : "+it.next());
        }

    }
}
