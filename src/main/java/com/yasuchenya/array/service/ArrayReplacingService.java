package com.yasuchenya.array.service;

import com.yasuchenya.array.entity.IntegerArray;
import com.yasuchenya.array.exception.IntegerArrayException;

public interface ArrayReplacingService {

    void replaceElement(IntegerArray sourceArray) throws IntegerArrayException;

}
