package com.example.rocko;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Rocko on 2016/12/14.
 */
public class BasicCalculatorTest {

    private BasicCalculator basicCalculator;

    @Before
    public void setUp() {
        basicCalculator = new BasicCalculator();
    }

    @Test
    public void enterString1_1andReturn2() {

        String s = "1 + 1";
        Integer act = basicCalculator.calculate(s);

        Assert.assertEquals(2, act.intValue());


    }

    @Test
    public void enterString1_2_2andReturn3() {

        String s = " 2-1 + 2 ";
        Integer act = basicCalculator.calculate(s);

        Assert.assertEquals(3, act.intValue());


    }


    @Test
    public void enterString1_4_5_2_3_6_8andReturn23() {

        String s = "(1+(4+5+2)-3)+(6+8)";
        Integer act = basicCalculator.calculate(s);

        Assert.assertEquals(23, act.intValue());


    }

    @Test
    public void enterString2147483647andReturn2147483647() {

        String s = "2147483647";
        Integer act = basicCalculator.calculate(s);

        Assert.assertEquals(2147483647, act.intValue());


    }


    @Test
    public void enterString_30andReturn30() {

        String s = "  30";
        Integer act = basicCalculator.calculate(s);

        Assert.assertEquals(30, act.intValue());


    }

}
