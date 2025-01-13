package com.arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void removeDuplicates(int[] array){
        Arrays.sort(array);
        int[] temp = new int[array.length];
        int j=0;
        for(int i=0;i< array.length-1;i++){
            if(array[i]!=array[i+1]){
                temp[j]=array[i];
                j++;
            }
        }

        temp[j++] = array[array.length-1];
        int[] uniqueArray = Arrays.copyOf(temp, j);
        System.out.println(uniqueArray.length);
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));

    }
    public static void main(String[] args) {
        int[] arr = {33,11,10,10,44,12};
        removeDuplicates(arr);
    }
}
