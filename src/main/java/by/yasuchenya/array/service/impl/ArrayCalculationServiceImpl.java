package by.yasuchenya.array.service.impl;

import by.yasuchenya.array.validator.IntegerArrayValidator;
import by.yasuchenya.array.service.ArrayCalculationService;
import by.yasuchenya.array.entity.IntegerArray;
import by.yasuchenya.array.exception.IntegerArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.stream.IntStream;

public class ArrayCalculationServiceImpl implements ArrayCalculationService {
    static Logger logger = LogManager.getLogger();

    public double calculateAvg(IntegerArray sourceArray) throws IntegerArrayException {
        logger.info("Calculate average method invoked");
        if (IntegerArrayValidator.isArrayEmpty(sourceArray)) {
            throw new IntegerArrayException("Array is empty!");
        }
        int sum = 0;
        int size = sourceArray.size();
        for (int i = 0; i < size; i++) {
            sum += sourceArray.getElement(i);
        }
        return (double)sum/size;
    }

    public int findMaxValue(IntegerArray sourceArray) throws IntegerArrayException {
        logger.info("Find max value method invoked");
        if (IntegerArrayValidator.isArrayEmpty(sourceArray)) {
            throw new IntegerArrayException("Array is empty!");
        }
        int max = sourceArray.getElement(0);
        int size = sourceArray.size();
        for (int i = 0; i < size; i++) {
            if (sourceArray.getElement(i) > max) {
                max = sourceArray.getElement(i);
            }
        }
        return max;
    }

    public int findMinValue(IntegerArray sourceArray) throws IntegerArrayException {
        logger.info("Find min value method invoked");
        if (IntegerArrayValidator.isArrayEmpty(sourceArray)) {
            throw new IntegerArrayException("Array is empty!");
        }
        int min = sourceArray.getElement(0);
        int size = sourceArray.size();
        for (int i = 0; i < size; i++) {
            if (sourceArray.getElement(i) < min) {
                min = sourceArray.getElement(i);
            }
        }
        return min;
    }

    public int calculateSum(IntegerArray sourceArray) throws IntegerArrayException {
        logger.info("Calculate sum method invoked");
        if (IntegerArrayValidator.isArrayEmpty(sourceArray)) {
            throw new IntegerArrayException("Array is empty!");
        }
        int sum = 0;
        int size = sourceArray.size();
        for (int i = 0; i < size; i++) {
            sum += sourceArray.getElement(i);
        }
        return sum;
    }

    public int calculatePositiveSum(IntegerArray sourceArray) throws IntegerArrayException {
        logger.info("Calculate sum of positives method invoked");
        if (IntegerArrayValidator.isArrayEmpty(sourceArray)) {
            throw new IntegerArrayException("Array is empty!");
        }
        int sum = 0;
        int size = sourceArray.size();
        for (int i = 0; i < size; i++) {
            if (sourceArray.getElement(i) > 0) {
                sum += sourceArray.getElement(i);
            }
        }
        return sum;
    }

    public double calculateAvgStream(IntegerArray sourceArray) throws IntegerArrayException {
        logger.info("Calculate average via stream method invoked");
        if (IntegerArrayValidator.isArrayEmpty(sourceArray)) {
            throw new IntegerArrayException("Array is empty!");
        }
        int[] array = sourceArray.getArray();
        return IntStream.of(array)
                .average().getAsDouble();
    }

    public int findMaxValueStream(IntegerArray sourceArray) throws IntegerArrayException {
        logger.info("Find max value via stream method invoked");
        if (IntegerArrayValidator.isArrayEmpty(sourceArray)) {
            throw new IntegerArrayException("Array is empty!");
        }
        int[] array = sourceArray.getArray();
        return IntStream.of(array)
                .max().getAsInt();
    }

    public int findMinValueStream(IntegerArray sourceArray) throws IntegerArrayException {
        logger.info("Find min value via stream method invoked");
        if(IntegerArrayValidator.isArrayEmpty(sourceArray)){
            throw new IntegerArrayException("Array is empty!");
        }
        int[] array = sourceArray.getArray();
        return IntStream.of(array)
                .min().getAsInt();
    }

    public int calculateSumStream(IntegerArray sourceArray) throws IntegerArrayException{
        logger.info("Calculate sum via stream method invoked");
        if (IntegerArrayValidator.isArrayEmpty(sourceArray)) {
            throw new IntegerArrayException("Array is empty!");
        }
        int[] array = sourceArray.getArray();
        return IntStream.of(array)
                .reduce((x,y ) -> x + y).getAsInt();
    }

    public int calculatePositiveSumStream(IntegerArray sourceArray) throws IntegerArrayException {
        logger.info("Calculate sum of positives via stream method invoked");
        if (IntegerArrayValidator.isArrayEmpty(sourceArray)) {
            throw new IntegerArrayException("Array is empty!");
        }
        int[] array = sourceArray.getArray();
        return IntStream.of(array)
                .filter(x -> x > 0)
                .filter(y -> y > 0)
                .reduce((x, y) -> x + y).getAsInt();
    }
}
