package com.example.rocko;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Rocko on 2016/11/28.
 */
@Slf4j
public class TwoSumTest {

    private TwoSum twoSum;

    @Before
    public void setUp() {
        twoSum = new TwoSum();
    }

    @Test
    public void testGetTarget9() {
        int[] list = new int[]{2, 7, 11, 15};
        Integer target = 9;

        int[] act = twoSum.getSumTwo(list, target);

        Assert.assertEquals("[0, 1]", Arrays.toString(act));
    }

}
