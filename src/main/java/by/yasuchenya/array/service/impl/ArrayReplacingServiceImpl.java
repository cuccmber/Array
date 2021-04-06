package by.yasuchenya.array.service.impl;

import by.yasuchenya.array.validator.IntegerArrayValidator;
import by.yasuchenya.array.service.ArrayReplacingService;
import by.yasuchenya.array.entity.IntegerArray;
import by.yasuchenya.array.exception.IntegerArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static java.lang.Math.abs;

public class ArrayReplacingServiceImpl implements ArrayReplacingService {
    static Logger logger = LogManager.getLogger();

    public void replaceElement(IntegerArray sourceArray) throws IntegerArrayException {
        logger.info("Replace negative values with their absolute ones method invoked");
        if (IntegerArrayValidator.isArrayEmpty(sourceArray)) {
            throw new IntegerArrayException("Array is empty!");
        }
        for (int i = 0; i < sourceArray.size(); i++) {
            if (sourceArray.getElement(i) < 0) {
                sourceArray.setElement(abs(sourceArray.getElement(i)), i);
            }
        }
    }
}
