package test.yasuchenya.task.array.action;

import com.yauchenya.task.array.action.Replacing;
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

public class ReplacingTest {
    static Logger logger = LogManager.getLogger();
    private Replacing replacing;
    private IntegerArray testArray;
    private final int[] EXPECTED_ARRAY = {1, 1};
    private static final String FILEPATH = "./src/main/resources/input/input.txt";
    private static final int ARRAY_NUMBER = 1;

    @BeforeClass
    public void setUp() {
        replacing = new Replacing();
        TextFileReader textFileReader = new TextFileReader();
        List<String> readStrings = textFileReader.readFromTextFile(FILEPATH);
        StringsToArraysParser stringsToArraysParser = new StringsToArraysParser();
        List<List<String>> splitStrings = stringsToArraysParser.splitStrings(readStrings);
        List<IntegerArray> sourceArrays = stringsToArraysParser.parseStrings(splitStrings);
        testArray = sourceArrays.get(ARRAY_NUMBER);

    }
    @Test
    public void testReplaceItem() {
        try {
            replacing.replaceElement(testArray);
        } catch (IntegerArrayException e) {
            logger.error("Array is empty");
        }
        int[] actual = testArray.getArray();
        int[] expected = EXPECTED_ARRAY;
        Assert.assertEquals(actual, expected);
    }
}