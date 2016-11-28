package com.example.rocko;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by Rocko on 2016/11/28.
 */
public class TwoSum {


    public int[] getSumTwo(int[] list, Integer target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < list.length; i++) {
            int complate = target - list[i];
            if (map.containsKey(complate)) {
                return new int[]{map.get(complate), i};
            }

            map.put(list[i], i);
        }

        return new int[]{-1 , -1};
    }

}
