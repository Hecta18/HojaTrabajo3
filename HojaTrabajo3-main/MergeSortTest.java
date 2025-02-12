import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MergeSortTest {

    @Test
    void testMergeSortWithUnsortedArray() {
        int[] array = {5, 3, 8, 1, 2};
        int[] expected = {1, 2, 3, 5, 8};
        mergeSort.mergeSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    void testMergeSortWithSortedArray() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        mergeSort.mergeSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    void testMergeSortWithReverseSortedArray() {
        int[] array = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        mergeSort.mergeSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    void testMergeSortWithDuplicates() {
        int[] array = {4, 2, 4, 1, 2};
        int[] expected = {1, 2, 2, 4, 4};
        mergeSort.mergeSort(array);
        assertArrayEquals(expected, array);
    }
}