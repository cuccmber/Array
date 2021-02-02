package com.yauchenya.task.array.validator;

import com.yauchenya.task.array.entity.IntegerArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IntegerArrayValidator {
    static Logger logger = LogManager.getLogger();
    private static final String ARRAY_ELEMENT_PATTERN = "(?<=(^| ))((\\+|\\-)?\\d+)(?=( |$))";

    public static boolean isArrayOfIntegers(String sourceString){
        boolean result = sourceString.matches(ARRAY_ELEMENT_PATTERN);
        logger.info("Result of value validation is " + result);
        return result;
    }

    public static boolean isArrayEmpty(IntegerArray array) {
        boolean result = true;
        if (array.size() == 0) {
            logger.info("Array is empty");
        } else {
            result = false;
            logger.info("Array is not empty");
        }
        return result;
    }
}
