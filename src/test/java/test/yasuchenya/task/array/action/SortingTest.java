package test.yasuchenya.task.array.action;

import com.yauchenya.task.array.action.Sorting;
import com.yauchenya.task.array.entity.IntegerArray;
import com.yauchenya.task.array.exception.IntegerArrayException;
import com.yauchenya.task.array.parser.StringsToArraysParser;
import com.yauchenya.task.array.reader.TextFileReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class SortingTest {
    static Logger logger = LogManager.getLogger();
    private IntegerArray testArray;
    private final int[] EXPECTED_SORTED_ARRAY = {-1, 2, 3, 4, 7};
    private static final String FILEPATH = "./src/main/resources/input/input.txt";
    private static final int ARRAY_NUMBER = 0;


    @BeforeClass
    public void setUp(){
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
            Sorting.bubbleSortAscending(testArray);
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
            Sorting.gnomeSortAscending(testArray);
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
            Sorting.insertionSortAscending(testArray);
        } catch (IntegerArrayException e) {
            logger.error("Array is empty");
        }
        int[] actual = testArray.getArray();
        int[] expected = EXPECTED_SORTED_ARRAY;
        Assert.assertEquals(actual, expected);
    }
}