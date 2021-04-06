package com.yasuchenya.array.parser;

import com.yasuchenya.array.validator.IntegerArrayValidator;
import com.yasuchenya.array.entity.IntegerArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StringsToArraysParser {
    static Logger logger = LogManager.getLogger();
    private static final String DELIMITER = " ";
    private static final String NEWLINE = "\n";

    public List<List<String>> splitStrings(List<String> sourceStrings) {
        List<List<String>> resultStrings = new ArrayList<>();
        for (String string: sourceStrings) {
            List<String> splitString = Stream.of(string.split(DELIMITER))
                    .map (elem -> new String(elem))
                    .collect(Collectors.toList());
            resultStrings.add(splitString);
        }
        return resultStrings;
    }

    public List<IntegerArray> parseStrings(List<List<String>> sourceStrings) {
        List<IntegerArray> resultArrays = new ArrayList<>();
        for (int i = 0; i < sourceStrings.size(); i++) {
            List<String> currentString = sourceStrings.get(i);
            List<String> parsedString = new ArrayList<>();
            int count = 0;
            for (int j = 0; j < currentString.size(); j++) {
                String string = currentString.get(j);
                if (!IntegerArrayValidator.isArrayOfIntegers(string) && string != NEWLINE) {
                    count++;
                    logger.error("Invalid string in line " + i);
                }
            }
            if (count == 0) {
                for (int j = 0; j < currentString.size(); j++) {
                    String string = currentString.get(j);
                    parsedString.add(string);
                }
            }
            int[] parsedArray = new int[parsedString.size()];
            for (int k = 0; k < parsedString.size(); k++) {
                String tempString =  parsedString.get(k);
                int element = Integer.parseInt(tempString);
                parsedArray[k] = element;
            }
            IntegerArray parsedIntegerArray = new IntegerArray(parsedArray);
            if (!IntegerArrayValidator.isArrayEmpty(parsedIntegerArray)) {
                resultArrays.add(parsedIntegerArray);
            }
        }
        return resultArrays;
    }
}
