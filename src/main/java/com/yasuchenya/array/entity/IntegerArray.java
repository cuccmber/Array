package com.yasuchenya.array.entity;

import com.yasuchenya.array.validator.IntegerArrayValidator;
import com.yasuchenya.array.exception.IntegerArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IntegerArray {
    static Logger logger = LogManager.getLogger();
    private int[] array;

    public IntegerArray(int ... elements){
        logger.info("Created new array");
        array = new int[elements.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = elements[i];
        }
    }

    public int[] getArray(){
        return  array;
    }

    public void setArray(int ... elements) throws IntegerArrayException {
        if(IntegerArrayValidator.isArrayEmpty(this)){
            throw new IntegerArrayException("Array is empty!");
        }
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
}
