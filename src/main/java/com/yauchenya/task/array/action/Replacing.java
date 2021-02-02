package com.yauchenya.task.array.action;

import com.yauchenya.task.array.entity.IntegerArray;
import com.yauchenya.task.array.exception.IntegerArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.yauchenya.task.array.validator.IntegerArrayValidator.isArrayEmpty;
import static java.lang.Math.abs;

public class Replacing {
    static Logger logger = LogManager.getLogger();

    public void replaceElement(IntegerArray sourceArray) throws IntegerArrayException {
        logger.info("Replace negative values with their absolute ones method invoked");
        if(isArrayEmpty(sourceArray)){
            throw new IntegerArrayException("Array is empty!");
        }
        for(int i = 0; i < sourceArray.size(); i++){
            if(sourceArray.getElement(i) < 0){
                sourceArray.setElement(abs(sourceArray.getElement(i)), i);
            }
        }

    }
}
