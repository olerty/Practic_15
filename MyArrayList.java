package com.company;

public class MyArrayList<Object> {
    private final int size = 10;
    private Circle[] array = new Circle[size];
    private int pointer = 0;

    public void add(Circle ob) {
        if(pointer == array.length - 1)
            resize(array.length + 1);
        array[pointer++] = ob;
    }

    public Circle get(int index) {
        return (Circle)array[index];
    }

    public void remove(int index) {
        for (int i = index; i < pointer; i++)
            array[i] = array[i + 1];
        array[pointer] = null;
        pointer--;
        resize(array.length - 1);
    }

    public int size() {
        return pointer;
    }

    private void resize(int newLength) {
        Circle[] newArray = new Circle[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }
}