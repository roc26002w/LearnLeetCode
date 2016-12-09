package com.example.rocko.lib;

import com.example.rocko.Interface.NestedInteger;

import java.util.List;

/**
 * Created by Rocko on 2016/12/8.
 */
public class NestedIntergerImpl implements NestedInteger {

    private Object val;


    public NestedIntergerImpl(Object a) {
        this.val = a;
    }

    public boolean isInteger() {

        return val instanceof Integer;

    }

    public Integer getInteger() {
        return (Integer) val;
    }

    public List<NestedInteger> getList() {
        return (List<NestedInteger>) val;
    }

}
