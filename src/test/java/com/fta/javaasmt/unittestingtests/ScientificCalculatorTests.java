package com.fta.javaasmt.unittestingtests;



import com.fta.javaasmt.unittesting.ScientificCalculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.*;


public class ScientificCalculatorTests {


    /*private static final Logger logger = LogManager.getLogger(ScientificCalculatorTests.class.getName());
    ScientificCalculator scientificCalculator = new ScientificCalculator();


    @DataProvider(name = "testDataForAdd")
    public Object[][] testDataAdd() {
        return new Object[][]{
                {45, 35, 80},
                {40, 30, 70}


        };
    }

    @DataProvider(name = "testDataForSub")
    public Object[][] testDataSub() {

        return new Object[][]{
                {45, 35, 10},
                {45, 36, 9}


        };
    }

    @DataProvider(name = "testDataForPower")
    public Object[][] testDataPower() {

        return new Object[][]{
                {2, 3, 8},
                {3, 3, 27}


        };
    }

    @DataProvider(name = "testDataForDivision")
    public Object[][] testDataForDivision() {

        return new Object[][]{
                {1, 0, 0}


        };
    }

    @BeforeMethod
    public void setup() {
        logger.info("calculator tests started");
    }

    @Test(dataProvider = "testDataForAdd", groups = "smoke")
    public void addTest(long a, long b, long expectedResult) {

        long actualResult = scientificCalculator.sum(a, b);
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test(dataProvider = "testDataForSub", groups = "smoke")
    public void subTest(long a, long b, long expectedResult) {

        long actualResult = scientificCalculator.sub(a, b);
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test(dataProvider = "testDataForPower", groups = "regression")
    public void powerTest(double a, double b, double expectedResult) {

        double actualResult = scientificCalculator.pow(a, b);
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test(dataProvider = "testDataForDivision", groups = "regression", expectedExceptions = NumberFormatException.class)
    public void divTest(long a, long b, long expectedResult) {

        long actualResult = scientificCalculator.div(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @AfterMethod
    public void endMethod() {
        logger.info("calculator test completed and started another tests");
    }*/
}

