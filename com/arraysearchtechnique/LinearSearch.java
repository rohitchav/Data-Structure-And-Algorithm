package com.arraysearchtechnique;

import java.util.Scanner;
public class LinearSearch{
    public static int linearSearch(int[] array,int target){
        int index = -1;
        for(int i=0;i<array.length;i++){
            if(array[i]==target){
                index=i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array = {11,12,13,14,15};
        System.out.print("Enter Target Element: ");
        int target = sc.nextInt();
        int result = linearSearch(array,target);
        if(result==-1){
            System.out.println("Given element is not found");
        }else{
            System.out.println("Element Found at index "+result);
        }
    }
}
