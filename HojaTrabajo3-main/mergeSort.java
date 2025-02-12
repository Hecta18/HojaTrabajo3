import java.util.Arrays;
import java.util.Random;

public class mergeSort {
    public static void main(String[] args) {
        
        Random rand = new Random();
        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10000);
        }

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(numbers));

        mergeSort(numbers);

        System.out.println("\nAfter sorting:");
        System.out.println(Arrays.toString(numbers));

    }

    static void mergeSort(int[] numbers) {
        int length = numbers.length;

        if(length < 2) {
            return;
        }

        int midIndex = length / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[length - midIndex];

        for(int i = 0; i < midIndex; i++) {
            leftHalf[i] = numbers[i];
        }

        for(int i = midIndex; i < length; i++) {
            rightHalf[i - midIndex] = numbers[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        //Merge the two halves
        merge(leftHalf, rightHalf, numbers);
    }

    private static void merge (int[] leftHalf, int[] rightHalf, int[] numbers) {
        int leftLength = leftHalf.length;
        int rightLength = rightHalf.length;
        int i = 0, j = 0, k = 0;

        while(i < leftLength && j < rightLength) {
            if(leftHalf[i] <= rightHalf[j]) {
                numbers[k] = leftHalf[i];
                i++;
            }
            else {
                numbers[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while(i < leftLength) {
            numbers[k] = leftHalf[i];
            i++;
            k++;
        }

        while(j < rightLength) {
            numbers[k] = rightHalf[j];
            j++;
            k++;
        }
    }
}