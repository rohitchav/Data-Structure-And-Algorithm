package com.arrayadt;

public interface ArrayADTInter {
    //Insert In Array
    void insert(int value);

    //Traverse Array
    void traverse();

    int search(int value);

    int getElement(int index);

    void update(int ind, int value);

    void delete(int deleteIndex);
}
