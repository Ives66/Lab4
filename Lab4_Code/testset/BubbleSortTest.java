import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void bubbleSort() {
        int arr[] = new int[]{2,5,1,3,4,7,6,10,7};
        BubbleSort.BubbleSort(arr);
    }
}