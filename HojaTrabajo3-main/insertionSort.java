import java.util.Arrays;
import java.util.Random;

public class insertionSort {
    
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10000);
        }

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(numbers));

        insertionSort(numbers);

        System.out.println("\nAfter sorting:");
        System.out.println(Arrays.toString(numbers));
    }

    static void insertionSort(int[] numbers) {
        
        for(int i = 1; i < numbers.length; i++) {
            int currentValue = numbers[i];
            int j = i - 1;

            while(j >= 0 && numbers[j] > currentValue) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = currentValue;
        }

    }

}
