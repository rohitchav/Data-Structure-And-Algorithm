package com.arrays;

public class ArrayUtlities {

    public static int maxElement(int[] array){
        int largestElement = array[0];
        for(int i:array){
            if(i>largestElement){
                largestElement = i;
            }
        }
       return largestElement;
    }
    public static void printArray(int[] array){
        for(int value:array){
            System.out.print(value +"  "+"\n");
        }
    }

    public static int[] reverseArray(int[] array){
        if(array.length==1){
            System.out.println("Already Reverse");
        }
        for(int i=0;i<array.length / 2;i++){
            int temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1]=temp;
        }
        return array;
    }

    public static int sumOfArray(int[] array){
        int sum = 0;
        for(int value:array){
            sum+=value;
        }
        return sum;
    }

    public static int countOfElement(int[] array,int target){
        int count = 0,i=0;
        while (i<array.length){
            if(array[i]==target){
                count++;
            }
            i++;
        }
        return count;
    }

    public static int secondLargestElement(int[] array){
        int secondLargest = 0,largest = array[0];
        for(int value:array){
            if(largest < value){
                secondLargest = largest;
                largest = value;
            }else if (value > secondLargest && largest != value){
                secondLargest = value;
            }
        }
        return secondLargest;
    }

    public static boolean isSortedArray(int[] array){
        boolean flag= true;
        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                System.out.println(array[i-1]+"<"+array[i]);
                flag = false;
            }
        }
        return flag;
    }

}
