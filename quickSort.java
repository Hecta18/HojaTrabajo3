import java.util.Arrays;
import java.util.Random;

public class quickSort {
    public static void main(String[] args) {
        
        Random rand = new Random();
        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10000);
        }

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(numbers));

        quickSort(numbers, 0, numbers.length - 1);

        System.out.println("\nAfter sorting:");
        System.out.println(Arrays.toString(numbers));

    }

    private static void quickSort(int[] numbers) {
        quickSort(numbers, 0, numbers.length - 1);
    }

    private static void quickSort(int[] numbers, int lowIndex, int highIndex) {

        if(lowIndex >= highIndex) {
            return;
        }

        int pivotIndex = new Random().nextInt(highIndex - lowIndex + 1) + lowIndex;
        int pivot = numbers[pivotIndex];
        swap(numbers, pivotIndex, highIndex);

        int leftPointer = partition(numbers, lowIndex, highIndex, pivot);

        quickSort(numbers, lowIndex, leftPointer - 1);
        quickSort(numbers, leftPointer + 1, highIndex);
    }


    private static int partition(int[] numbers, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex - 1;

        while(leftPointer < rightPointer) {
            while(numbers[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while(numbers[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(numbers, leftPointer, rightPointer);
        }

        if(numbers[leftPointer] > pivot) {
            swap(numbers, leftPointer, highIndex);
        }
        else {
            leftPointer = highIndex;
        }

        return leftPointer;
    }

    private static void swap(int[] numbers, int a, int b) {
        int temp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = temp;
    }
}