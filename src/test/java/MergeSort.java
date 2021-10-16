import org.junit.Test;

import java.util.Arrays;

public class MergeSort {
    @Test
    public void test(){
        int[] array = {9,2,4,3,1,5,7,8};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    private void sort(int[] array){
        mergeSort(array, 0, array.length - 1);
    }

    private void mergeSort(int[] array, int startIndex, int endIndex){
        if(endIndex - startIndex == 0)return;
        int middle = (endIndex - startIndex) / 2 + startIndex;
        mergeSort(array, startIndex, middle);
        mergeSort(array, middle + 1, endIndex);
        mergeArrays(array, startIndex, endIndex, middle);
    }

    private void mergeArrays(int[] array, int startIndex, int endIndex, int middle) {
        int i = 0;
        int j = 0;
        int counter = 0;
        int[] left = new int[middle - startIndex + 1];
        System.arraycopy(array, startIndex, left, 0, middle - startIndex + 1);
        int[] right = new int[endIndex - middle];
        System.arraycopy(array, middle + 1, right, 0, endIndex - middle);
        while(i <= middle - startIndex && j < endIndex - middle){
            if(left[i] < right[j]){
                array[startIndex + counter] = left[i];
                counter++;
                i++;
            }else{
                array[startIndex + counter] = right[j];
                counter++;
                j++;
            }
        }

        for(int k = i ; k < left.length ; k++){
            array[startIndex + counter] = left[k];
            counter++;
        }
        for(int k = j ; k < right.length ; k++){
            array[startIndex + counter] = right[k];
            counter++;
        }

    }
}
