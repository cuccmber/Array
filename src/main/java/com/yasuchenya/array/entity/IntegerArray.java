package com.yasuchenya.array.entity;

import com.yasuchenya.array.validator.IntegerArrayValidator;
import com.yasuchenya.array.exception.IntegerArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IntegerArray {
    static Logger logger = LogManager.getLogger();
    private int[] array;

    public IntegerArray(int ... elements) {
        logger.info("Created new array");
        array = new int[elements.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = elements[i];
        }
    }

    public int[] getArray(){
        int[] arrayCopy = array.clone();
        return arrayCopy;
    }

    public void setArray(int ... elements) throws IntegerArrayException {
        if (IntegerArrayValidator.isArrayEmpty(this)) {
            throw new IntegerArrayException("Array is empty!");
        }
        if (elements.length == array.length) {
            for (int i = 0; i < array.length; i++) {
                array[i] = elements[i];
            }
        }
    }

    public int getElement(int index) {
        return array[index];
    }

    public int size() {
        return array.length;
    }

    public void setElement(int value, int index) {
        if (index < array.length) {
            array[index] = value;
        }
    }

    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + array.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (this == null) {
            return false;
        }
        IntegerArray temp = (IntegerArray) o;
        return getClass() == temp.getClass() && array.equals(temp.array);
    }

    @Override
    public String toString() {
        return "Array:" + array.toString();
    }
}
