package com.arrays;

public class MovesZeroToEnd {
    public static void moveZeroToEnd(int[] array) {
        int nonZeroIndex = 0; // Pointer to place the next non-zero element

        // Traverse the array
        for (int i = 0; i < array.length; i++) {
          if(array[i]!=0){
              int temp = array[i];
              array[i] = array[nonZeroIndex];
              array[nonZeroIndex] = temp;

              nonZeroIndex++;
              System.out.println("Non Zero Index: "+nonZeroIndex);
          }
        }
    }


    public static void main(String[] args) {
        int[] arr = {34,10,20,0,40};
        moveZeroToEnd(arr);
        ArrayUtlities.printArray(arr);
    }
}
