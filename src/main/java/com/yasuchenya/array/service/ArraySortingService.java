package com.yasuchenya.array.service;

import com.yasuchenya.array.entity.IntegerArray;
import com.yasuchenya.array.exception.IntegerArrayException;

public interface ArraySortingService {

    void bubbleSortAscending(IntegerArray sourceArray) throws IntegerArrayException;
    void gnomeSortAscending(IntegerArray sourceArray) throws IntegerArrayException;
    void insertionSortAscending(IntegerArray sourceArray) throws IntegerArrayException;
}
