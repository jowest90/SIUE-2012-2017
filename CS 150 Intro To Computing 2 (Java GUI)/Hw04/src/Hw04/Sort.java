/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw04;

/**
 *
 * @author Johnny
 */
public class Sort{

    public Sort() {
    }

    public int[] selection(int[] arrayToSort) {
        for (int top = 0; top <= arrayToSort.length - 2; top++) {
            int minIndex = top;
            for (int i = top + 1; i <= arrayToSort.length - 1; i++) {
                if (arrayToSort[i] < arrayToSort[minIndex]) {
                    minIndex = i;
                }
            }
            swap(arrayToSort, top, minIndex);
        }
        return null;
    }

   public static String bubble(int[] arrayToSort) {
        long startTime = System.nanoTime();
        boolean sorted = false;
        int pass = 1;
        while (pass <= arrayToSort.length - 1 && !sorted) {
            sorted = true;
            for (int i = arrayToSort.length - 1; i >= pass; i--) {
                if (arrayToSort[i] < arrayToSort[i - 1]) {
                    swap(arrayToSort, i, i - 1);
                    sorted = false;
                }
            }
            pass += 1;
        }
        long estimatedTime = (System.nanoTime() - startTime);
        double milli = ((double)estimatedTime) / 1000000;
        return Double.toString(milli);
    }

    public int[] insertion(int[] arrayToSort) {
        int holdItem;
        int j = 0;
        for (int i = 0; i < 10; i++) {
            holdItem = arrayToSort[i];
            for (int k = 0; k < 10; k++) {
                arrayToSort[j + 1] = arrayToSort[j];
            }
            arrayToSort[j + 1] = holdItem;
        }
        return null;
    }
    
    private static void swap(int[] arrayToSort, int index1, int index2) {
        int tmp = arrayToSort[index1];
        arrayToSort[index1] = arrayToSort[index2];
        arrayToSort[index2] = tmp;
    }
    
    private int indexOfNextSmallestElement(int[] arrayToSort, int startAtIndex) {
        int minIndex = startAtIndex;
        
        for (int i = startAtIndex + 1; i <= arrayToSort.length - 1; i++) {
            if (arrayToSort[i] < arrayToSort[minIndex]) {
               minIndex = i; 
            }
        }
        
        return minIndex;
    }
}
