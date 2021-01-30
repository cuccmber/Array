package com.yauchenya.task.array.action.entity;

public class Array {
    private int[] array;

    public Array(int ... elements){
        array = new int[elements.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = elements[i];
        }
    }

    public int[] getArray(){
        return  array;
    }

    public void setArray(int ... elements){
        if(elements.length == array.length) {
            for (int i = 0; i < array.length; i++) {
                array[i] = elements[i];
            }
        }
    }

    public int getElement(int index){
        return array[index];
    }

    public int size(){
        return array.length;
    }

    public void setElement(int value, int index){
        if(index < array.length){
            array[index] = value;
        }
    }





    public void printArray(){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
