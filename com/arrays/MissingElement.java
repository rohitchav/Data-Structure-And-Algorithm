package com.arrays;

public class MissingElement {

    public static int missingElement(int[] array){
        int arraySum = 0;
        int n = array.length+1;
        for (int j : array) {
            arraySum += j;
        }
        int actualSum = n*(n+1)/2;
        return actualSum - arraySum;
    }


    public static void main(String[] args) {
       int[] array = {1,2,3,4,5,6,7,9};
       System.out.println("Missing Element In Array: "+missingElement(array));
    }
}
