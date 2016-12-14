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

}
