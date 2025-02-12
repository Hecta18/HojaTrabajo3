import java.util.Arrays;
import java.util.Random;

public class selectionSort {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();

        // Fill the numbers with random numbers between 1 and 10000
        for (int i = 0; i < numbers.length; i++) {
         numbers[i] = rand.nextInt(10000) + 1;
        }

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(numbers));

        // Perform selection sort
        selectionSort(numbers);

        // Print the sorted numbers
        System.out.println("\nAfter sorting:");
        System.out.println(Arrays.toString(numbers));
    }

    private static void selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int minimum = numbers[i];
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < minimum) {
                    minimum = numbers[j];
                    minIndex = j;
                }
            }
            swap(numbers, i, minIndex);
        }
    }

    private static void swap(int[] numbers, int a, int b) {
        int temp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = temp;
    }
}