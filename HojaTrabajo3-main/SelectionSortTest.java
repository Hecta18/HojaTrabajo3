
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SelectionSortTest {

    @Test
    void testSelectionSortWithUnsortedArray() {
        int[] array = {5, 3, 8, 1, 2};
        int[] expected = {1, 2, 3, 5, 8};
        selectionSort.selectionSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    void testSelectionSortWithSortedArray() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        selectionSort.selectionSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    void testSelectionSortWithReverseSortedArray() {
        int[] array = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        selectionSort.selectionSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    void testSelectionSortWithDuplicates() {
        int[] array = {4, 2, 4, 1, 2};
        int[] expected = {1, 2, 2, 4, 4};
        selectionSort.selectionSort(array);
        assertArrayEquals(expected, array);
    }
}