import java.util.Arrays;

public class ArrayClassJava {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,44,5,6};
        Arrays.sort(numbers);
        for (int number : numbers){
            System.out.println(number);
        }
        System.out.println(numbers.toString());
        int index = Arrays.binarySearch(numbers,6);
        System.out.println(index);
    }
}
