package com.yasuchenya.array.action;

import com.yasuchenya.array.validator.IntegerArrayValidator;
import com.yasuchenya.array.entity.IntegerArray;
import com.yasuchenya.array.exception.IntegerArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Sorting {
    static Logger logger = LogManager.getLogger();

    public static void bubbleSortAscending(IntegerArray sourceArray) throws IntegerArrayException {
        logger.info("Bubble sort method invoked");
        if(IntegerArrayValidator.isArrayEmpty(sourceArray)){
            throw new IntegerArrayException("Array is empty!");
        }
        int size = sourceArray.size();
        for (int i = 0; i < size - 1; i++)
            for (int j = 0; j < size - i - 1; j++)
                if (sourceArray.getElement(j) > sourceArray.getElement(j + 1))
                {
                    int temp = sourceArray.getElement(j);
                    sourceArray.setElement(sourceArray.getElement(j + 1), j);
                    sourceArray.setElement(temp, j + 1);
                }
    }

    public static void gnomeSortAscending(IntegerArray sourceArray) throws IntegerArrayException{
        logger.info("Gnome sort method invoked");
        if(IntegerArrayValidator.isArrayEmpty(sourceArray)){
            throw new IntegerArrayException("Array is empty!");
        }
        int size = sourceArray.size();
        for (int i = 0; i < size; i++) {
            if (i == 0)
                i++;
            if (sourceArray.getElement(i) >= sourceArray.getElement(i - 1))
                i++;
            else {
                int temp = sourceArray.getElement(i);
                sourceArray.setElement(sourceArray.getElement(i - 1), i);
                sourceArray.setElement(temp, i - 1);
                i--;
            }
        }
    }

    public static void insertionSortAscending(IntegerArray sourceArray) throws IntegerArrayException{
        logger.info("Insertion sort method invoked");
        if(IntegerArrayValidator.isArrayEmpty(sourceArray)){
            throw new IntegerArrayException("Array is empty!");
        }
        int size = sourceArray.size();
        for (int i = 1; i < size; ++i) {
            int key = sourceArray.getElement(i);
            int j = i - 1;

            while (j >= 0 && sourceArray.getElement(j) > key) {
                sourceArray.setElement(sourceArray.getElement(j), j + 1);
                j = j - 1;
            }
            sourceArray.setElement(key, j + 1);
        }
    }
}
