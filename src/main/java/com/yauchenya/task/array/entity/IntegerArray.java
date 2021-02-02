package com.yauchenya.task.array.entity;

import com.yauchenya.task.array.exception.IntegerArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.yauchenya.task.array.validator.IntegerArrayValidator.isArrayEmpty;

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
        if(isArrayEmpty(this)){
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
