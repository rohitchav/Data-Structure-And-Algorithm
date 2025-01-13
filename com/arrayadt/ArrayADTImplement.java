package com.arrayadt;

public class ArrayADTImplement implements ArrayADTInter {
    private int size;
    private int index;
    private int[] array;

    ArrayADTImplement(int size){
        this.size = size;
        array=new int[this.size];
        this.index=0;
    }

    //Insert In Array
    @Override
    public void insert(int value){
        this.array[index]=value;
        index++;
    }

    //Traverse Array
    @Override
    public void traverse(){
        for(int i=0;i<index;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }
    @Override
    public int search(int value){
        int indexResult = -1;
        for(int i=0;i<index;i++){
            if(array[i]==value){
                indexResult=i;
                break;
            }
        }
        return indexResult;
    }
    @Override
    public int getElement(int index){
        if(index<0 && index>this.index){
            System.out.println("Invalid Index");
            return -1;
        }
        return array[index];
    }

    @Override
    public void update(int ind, int value){
        if(ind<0 && ind>this.index){
            System.out.println("Invalid Index");
            return;
        }
        array[ind]=value;
    }

    @Override
    public void delete(int deleteIndex){
        if(deleteIndex<0 && deleteIndex>this.index){
            System.out.println("Invalid Index");
            return;
        }

        for(int i=deleteIndex;i<index-1;i++){
           array[i]=array[i+1];
        }
        index--;
    }

}
