package test.yasuchenya.array.service.impl;

import by.yasuchenya.array.service.ArrayCalculationService;
import by.yasuchenya.array.service.impl.ArrayCalculationServiceImpl;
import by.yasuchenya.array.entity.IntegerArray;
import by.yasuchenya.array.exception.IntegerArrayException;
import by.yasuchenya.array.parser.StringsToArraysParser;
import by.yasuchenya.array.reader.TextFileReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;

public class ArrayCalculationServiceImplTest {
    static Logger logger = LogManager.getLogger();
    private ArrayCalculationService arrayCalculationService;
    private IntegerArray testArray;
    private final int EXPECTED_AVG = 3;
    private final int EXPECTED_MAX = 7;
    private final int EXPECTED_MIN = -1;
    private final int EXPECTED_SUM = 15;
    private final int EXPECTED_POSITIVE_SUM = 16;
    private final double DELTA = 0.0001;
    private static final String FILEPATH = "/input/input.txt";
    private static final int ARRAY_NUMBER = 0;

    @BeforeClass
    public void setUp() throws IntegerArrayException {
        arrayCalculationService = new ArrayCalculationServiceImpl();
        TextFileReader textFileReader = new TextFileReader();
        List<String> readStrings = textFileReader.readFromTextFile(FILEPATH);
        StringsToArraysParser stringsToArraysParser = new StringsToArraysParser();
        List<List<String>> splitStrings = stringsToArraysParser.splitStrings(readStrings);
        List<IntegerArray> sourceArrays = stringsToArraysParser.parseStrings(splitStrings);
        testArray = sourceArrays.get(ARRAY_NUMBER);
    }

    @Test
    public void testCalculateAvg() {
        double actual = 0;
        try {
            actual = arrayCalculationService.calculateAvg(testArray);
        } catch (IntegerArrayException e) {
            logger.error("Array is empty");
        }
        double expected = EXPECTED_AVG;
        Assert.assertEquals(actual, expected, DELTA, "Test failed as");
    }

    @Test
    public void testFindMaxValue() {
        double actual = 0;
        try {
            actual = arrayCalculationService.findMaxValue(testArray);
        } catch (IntegerArrayException e) {
            logger.error("Array is empty");
        }
        double expected = EXPECTED_MAX;
        Assert.assertEquals(actual, expected, DELTA, "Test failed as");
    }

    @Test
    public void testFindMinValue() {
        double actual = 0;
        try {
            actual = arrayCalculationService.findMinValue(testArray);
        } catch (IntegerArrayException e) {
            logger.error("Array is empty");
        }
        double expected = EXPECTED_MIN;
        Assert.assertEquals(actual, expected, DELTA, "Test failed as");
    }

    @Test
    public void testCalculateSum() {
        double actual = 0;
        try {
            actual = arrayCalculationService.calculateSum(testArray);
        } catch (IntegerArrayException e) {
            logger.error("Array is empty");

        }
        double expected = EXPECTED_SUM;
        Assert.assertEquals(actual, expected, DELTA, "Test failed as");
    }

    @Test
    public void testCalculatePositiveSum() {
        double actual = 0;
        try {
            actual = arrayCalculationService.calculatePositiveSum(testArray);
        } catch (IntegerArrayException e) {
            logger.error("Array is empty");

        }
        double expected = EXPECTED_POSITIVE_SUM;
        Assert.assertEquals(actual, expected, DELTA, "Test failed as");
    }

    @Test
    public void testCalculateAvgStream() {
        double actual = 0;
        try {
            actual = arrayCalculationService.calculateAvgStream(testArray);
        } catch (IntegerArrayException e) {
            logger.error("Array is empty");
        }
        double expected = EXPECTED_AVG;
        Assert.assertEquals(actual, expected, DELTA, "Test failed as");
    }

    @Test
    public void testFindMaxValueStream() {
        double actual = 0;
        try {
            actual = arrayCalculationService.findMaxValueStream(testArray);
        } catch (IntegerArrayException e) {
            logger.error("Array is empty");
        }
        double expected = EXPECTED_MAX;
        Assert.assertEquals(actual, expected, DELTA, "Test failed as");
    }

    @Test
    public void testFindMinValueStream() {
        double actual = 0;
        try {
            actual = arrayCalculationService.findMinValueStream(testArray);
        } catch (IntegerArrayException e) {
            logger.error("Array is empty");
        }
        double expected = EXPECTED_MIN;
        Assert.assertEquals(actual, expected, DELTA, "Test failed as");
    }

    @Test
    public void testCalculateSumStream() {
        double actual = 0;
        try {
            actual = arrayCalculationService.calculateSumStream(testArray);
        } catch (IntegerArrayException e) {
            logger.error("Array is empty");

        }
        double expected = EXPECTED_SUM;
        Assert.assertEquals(actual, expected, DELTA, "Test failed as");
    }

    @Test
    public void testCalculatePositiveSumStream() {
        double actual = 0;
        try {
            actual = arrayCalculationService.calculatePositiveSumStream(testArray);
        } catch (IntegerArrayException e) {
            logger.error("Array is empty");

        }
        double expected = EXPECTED_POSITIVE_SUM;
        Assert.assertEquals(actual, expected, DELTA, "Test failed as");
    }
}