package by.yasuchenya.array.service;

import by.yasuchenya.array.entity.IntegerArray;
import by.yasuchenya.array.exception.IntegerArrayException;

public interface ArraySortingService {

    void bubbleSortAscending(IntegerArray sourceArray) throws IntegerArrayException;
    void gnomeSortAscending(IntegerArray sourceArray) throws IntegerArrayException;
    void insertionSortAscending(IntegerArray sourceArray) throws IntegerArrayException;
}
