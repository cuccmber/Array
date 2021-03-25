package test.yasuchenya.array.action;

import com.yasuchenya.array.action.Calculation;
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

public class CalculationTest {
    static Logger logger = LogManager.getLogger();
    private Calculation calculation;
    private IntegerArray testArray;
    private final int EXPECTED_AVG = 3;
    private final int EXPECTED_MAX = 7;
    private final int EXPECTED_MIN = -1;
    private final int EXPECTED_SUM = 15;
    private final int EXPECTED_POSITIVE_SUM = 16;
    private final double DELTA = 0.0001;
    private static final String FILEPATH = "./src/main/resources/input/input.txt";
    private static final int ARRAY_NUMBER = 0;


    @BeforeClass
    public void setUp(){
        calculation = new Calculation();
        TextFileReader textFileReader = new TextFileReader();
        List<String> readStrings = textFileReader.readFromTextFile(FILEPATH);
        StringsToArraysParser stringsToArraysParser = new StringsToArraysParser();
        List<List<String>> splitStrings = stringsToArraysParser.splitStrings(readStrings);
        List<IntegerArray> sourceArrays = stringsToArraysParser.parseStrings(splitStrings);
        testArray = sourceArrays.get(ARRAY_NUMBER);    }

    @Test
    public void testCalculateAvg() {
        double actual = 0;
        try {
            actual = calculation.calculateAvg(testArray);
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
            actual = calculation.findMaxValue(testArray);
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
            actual = calculation.findMinValue(testArray);
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
            actual = calculation.calculateSum(testArray);
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
            actual = calculation.calculatePositiveSum(testArray);
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
            actual = calculation.calculateAvgStream(testArray);
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
            actual = calculation.findMaxValueStream(testArray);
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
            actual = calculation.findMinValueStream(testArray);
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
            actual = calculation.calculateSumStream(testArray);
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
            actual = calculation.calculatePositiveSumStream(testArray);
        } catch (IntegerArrayException e) {
            logger.error("Array is empty");

        }
        double expected = EXPECTED_POSITIVE_SUM;
        Assert.assertEquals(actual, expected, DELTA, "Test failed as");
    }
}