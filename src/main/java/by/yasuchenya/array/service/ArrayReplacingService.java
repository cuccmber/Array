package by.yasuchenya.array.service;

import by.yasuchenya.array.entity.IntegerArray;
import by.yasuchenya.array.exception.IntegerArrayException;

public interface ArrayReplacingService {

    void replaceElement(IntegerArray sourceArray) throws IntegerArrayException;
}
