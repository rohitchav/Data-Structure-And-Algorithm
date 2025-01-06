package com.basics;

public class Complexities {
    static void constantTime(){
        int[] array = {1,2,3,4,5};
        System.out.println(array[0]); //not depend on input size
    }
    static void linearTime(){
        int[] array = {1,2,3,4,5};
        for (int i:array){
            System.out.print(i+" ");
        }
    }

    static void quadraticTime(){
        //Bubble Sorting
    }

    static void logarithmicTime(){
        //Binary Search
    }

    public static void main(String[] args) {
        constantTime();
        linearTime();
    }
}
