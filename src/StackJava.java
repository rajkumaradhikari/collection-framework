import java.util.Stack;

public class StackJava {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Goat");
        animals.add("Cow");

        System.out.println(animals);

        System.out.println(animals.peek());

        animals.pop();

        System.out.println(animals);

        System.out.println(animals.peek());
    }
}
