import org.junit.Test;

import java.util.Arrays;

public class InsertionSort {
    @Test
    public void test(){
        int[] array = {9,2,4,3,1,5,7,8};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
    private void sort(int[] array){
        for(int i = 1 ; i < array.length ; i++){
            int value = array[i];
            for(int j = i -1 ; 0 <= j ; j--){
                if(value< array[j] ){
                    int temp = array[j];
                    array[j + 1] = temp;
                    array[j] = value;
                }
            }
        }
    }
}
