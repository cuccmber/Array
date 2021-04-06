package com.yasuchenya.array.reader;

import com.yasuchenya.array.exception.IntegerArrayException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class TextFileReader {

    public List<String> readFromTextFile(String fileName) throws IntegerArrayException {
        InputStream inputStream = this.getClass().getResourceAsStream(fileName);
        if (inputStream == null) {
            throw new IntegerArrayException("Unable to read file" + fileName);
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        Stream<String> stringStream = bufferedReader.lines();
        List<String> strings = stringStream.collect(Collectors.toList());
        return strings;
    }
}
