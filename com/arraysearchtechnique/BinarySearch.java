package com.arraysearchtechnique;
import java.util.Scanner;
public class BinarySearch{
    public static int binarySearch(int[] array,int target){
        int low = 0;
        int high = array.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(array[mid]==target){
                return mid;
            }

            if(array[mid]<target){
                low = mid+1;
            }else if(array[mid] > target){
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] array = {11,12,13,14,15};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int targetIndex = binarySearch(array,target);
        System.out.println("Element Found At Index : "+targetIndex);
    }
}
