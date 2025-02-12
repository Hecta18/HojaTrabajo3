import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Generar números aleatorios y guardarlos en un archivo
        generateRandomNumbers("randNum.txt", 10); // Cambia el tamaño del arreglo si es necesario

        // Leer los números del archivo
        int[] numbers = readNumbersFromFile("randNum.txt");

        // Ordenar y medir el tiempo para cada algoritmo
        measureSortingTime("Selection Sort", numbers, selectionSort::selectionSort);
        measureSortingTime("Merge Sort", numbers, mergeSort::mergeSort);
        measureSortingTime("Insertion Sort", numbers, insertionSort::insertionSort);
        measureSortingTime("Quick Sort", numbers, quickSort::quickSort);
    }

    // Método para generar números aleatorios y guardarlos en un archivo
    public static void generateRandomNumbers(String filename, int size) {
        try (FileWriter fileWriter = new FileWriter(filename);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            Random rand = new Random();
            for (int i = 0; i < size; i++) {
                printWriter.println(rand.nextInt(10000)); // Números entre 0 y 9999
            }
        } catch (Exception e) {
            System.out.println("Error al generar números aleatorios: " + e);
        }
    }

    // Método para leer números desde un archivo
    public static int[] readNumbersFromFile(String filename) {
        int[] numbers = new int[10]; // Cambia el tamaño del arreglo si es necesario
        try (Scanner scanner = new Scanner(new File(filename))) {
            int index = 0;
            while (scanner.hasNextInt()) {
                numbers[index++] = scanner.nextInt();
            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e);
        }
        return numbers;
    }

    // Método para medir el tiempo de ejecución de un algoritmo de ordenamiento
    public static void measureSortingTime(String algorithmName, int[] array, SortingAlgorithm algorithm) {
        int[] copy = array.clone(); // Trabajar con una copia del arreglo
        long startTime = System.nanoTime();
        algorithm.sort(copy);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("\n" + algorithmName + ":");
        System.out.println("Tiempo de ejecución: " + duration + " nanosegundos");
        System.out.println("Arreglo ordenado: " + Arrays.toString(copy));
    }

    // Interfaz funcional para los algoritmos de ordenamiento
    @FunctionalInterface
    interface SortingAlgorithm {
        void sort(int[] array);
    }
}