package by.yasuchenya.array.service;

import by.yasuchenya.array.entity.IntegerArray;
import by.yasuchenya.array.exception.IntegerArrayException;

public interface ArrayCalculationService {

    double calculateAvg(IntegerArray sourceArray) throws IntegerArrayException;
    int findMaxValue(IntegerArray sourceArray) throws IntegerArrayException;
    int findMinValue(IntegerArray sourceArray) throws IntegerArrayException;
    int calculateSum(IntegerArray sourceArray) throws IntegerArrayException;
    int calculatePositiveSum(IntegerArray sourceArray) throws IntegerArrayException;
    double calculateAvgStream(IntegerArray sourceArray) throws IntegerArrayException;
    int findMaxValueStream(IntegerArray sourceArray) throws IntegerArrayException;
    int findMinValueStream(IntegerArray sourceArray) throws IntegerArrayException;
    int calculateSumStream(IntegerArray sourceArray) throws IntegerArrayException;
    int calculatePositiveSumStream(IntegerArray sourceArray) throws IntegerArrayException;
}
