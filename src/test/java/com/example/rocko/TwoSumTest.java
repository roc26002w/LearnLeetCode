package com.example.rocko;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Rocko on 2016/11/28.
 * 給予一組整數陣列及一個數字，這個數字將是陣列中隨便二個數的相加，並回傳此二數的key 值
 * 必需要符合下面的範例
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
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
