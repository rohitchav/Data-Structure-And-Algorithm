package com.arrayadt;

public class ArrayADT {
    public static void main(String[] args) {
        ArrayADTInter array = new ArrayADTImplement(10);
        array.insert(10);
        array.insert(12);
        array.insert(14);
        array.traverse();

        array.delete(1);
        array.traverse();
    }
}
