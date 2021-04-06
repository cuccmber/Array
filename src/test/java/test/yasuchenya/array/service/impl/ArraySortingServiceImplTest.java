package test.yasuchenya.array.service.impl;

import com.yasuchenya.array.service.ArraySortingService;
import com.yasuchenya.array.service.impl.ArraySortingServiceImpl;
import com.yasuchenya.array.entity.IntegerArray;
import com.yasuchenya.array.exception.IntegerArrayException;
import com.yasuchenya.array.parser.StringsToArraysParser;
import com.yasuchenya.array.reader.TextFileReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class ArraySortingServiceImplTest {
    static Logger logger = LogManager.getLogger();
    private ArraySortingService arraySortingService;
    private IntegerArray testArray;
    private final int[] EXPECTED_SORTED_ARRAY = {-1, 2, 3, 4, 7};
    private static final String FILEPATH = "/input/input.txt";
    private static final int ARRAY_NUMBER = 0;


    @BeforeClass
    public void setUp()  throws IntegerArrayException {
        arraySortingService = new ArraySortingServiceImpl();
        TextFileReader textFileReader = new TextFileReader();
        List<String> readStrings = textFileReader.readFromTextFile(FILEPATH);
        StringsToArraysParser stringsToArraysParser = new StringsToArraysParser();
        List<List<String>> splitStrings = stringsToArraysParser.splitStrings(readStrings);
        List<IntegerArray> sourceArrays = stringsToArraysParser.parseStrings(splitStrings);
        testArray = sourceArrays.get(ARRAY_NUMBER);
    }

    @Test
    public void testBubbleSortAscending() {
        try {
            arraySortingService.bubbleSortAscending(testArray);
        } catch (IntegerArrayException e) {
            logger.error("Array is empty");
        }
        int[] actual = testArray.getArray();
        int[] expected = EXPECTED_SORTED_ARRAY;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testGnomeSortAscending() {
        try {
            arraySortingService.gnomeSortAscending(testArray);
        } catch (IntegerArrayException e) {
            logger.error("Array is empty");
        }
        int[] actual = testArray.getArray();
        int[] expected = EXPECTED_SORTED_ARRAY;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testInsertionSortAscending() {
        try {
            arraySortingService.insertionSortAscending(testArray);
        } catch (IntegerArrayException e) {
            logger.error("Array is empty");
        }
        int[] actual = testArray.getArray();
        int[] expected = EXPECTED_SORTED_ARRAY;
        Assert.assertEquals(actual, expected);
    }
}