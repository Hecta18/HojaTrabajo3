import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuickSortTest {

    @Test
    void testQuickSortWithUnsortedArray() {
        int[] array = {5, 3, 8, 1, 2};
        int[] expected = {1, 2, 3, 5, 8};
        quickSort.quickSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    void testQuickSortWithSortedArray() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        quickSort.quickSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    void testQuickSortWithReverseSortedArray() {
        int[] array = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        quickSort.quickSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    void testQuickSortWithDuplicates() {
        int[] array = {4, 2, 4, 1, 2};
        int[] expected = {1, 2, 2, 4, 4};
        quickSort.quickSort(array);
        assertArrayEquals(expected, array);
    }
}