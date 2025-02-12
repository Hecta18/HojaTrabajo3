import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InsertionSortTest {

    @Test
    void testInsertionSortWithUnsortedArray() {
        int[] array = {5, 3, 8, 1, 2};
        int[] expected = {1, 2, 3, 5, 8};
        insertionSort.insertionSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    void testInsertionSortWithSortedArray() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        insertionSort.insertionSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    void testInsertionSortWithReverseSortedArray() {
        int[] array = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        insertionSort.insertionSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    void testInsertionSortWithDuplicates() {
        int[] array = {4, 2, 4, 1, 2};
        int[] expected = {1, 2, 2, 4, 4};
        insertionSort.insertionSort(array);
        assertArrayEquals(expected, array);
    }
}