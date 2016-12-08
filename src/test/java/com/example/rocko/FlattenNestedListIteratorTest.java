package com.example.rocko;

import com.example.rocko.Interface.NestedInteger;
import com.example.rocko.lib.NestedIntergerImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;


/**
 * Created by Rocko on 2016/12/8.
 */
public class FlattenNestedListIteratorTest {

    private List<Integer> resultList;

    @Before
    public void setUp(){
        resultList = new LinkedList<Integer>();

    }


    @Test
    public void testNestedIterator(){

        List<NestedInteger> nestedList1 = new ArrayList();
        nestedList1.add(new NestedIntergerImpl(5));
        nestedList1.add(new NestedIntergerImpl(4));

        List<NestedInteger> nestedList = new ArrayList();
        nestedList.add(new NestedIntergerImpl(1));
        nestedList.add(new NestedIntergerImpl(nestedList1));
        nestedList.add(new NestedIntergerImpl(3));

        NestedIterator i = new NestedIterator(nestedList);
        while (i.hasNext()) {
            resultList.add(i.next());
        }


        Assert.assertEquals("[1, 5, 4, 3]", String.valueOf(resultList));
    }

}

class NestedIterator implements Iterator<Integer> {


    Stack<NestedInteger> stack = new Stack<NestedInteger>();

    public NestedIterator(List<NestedInteger> nestedIntegers) {
        for (int i = nestedIntegers.size() -1 ; i >= 0; i--) {
            stack.push(nestedIntegers.get(i));
        }
    }

    public boolean hasNext() {
        while (!stack.isEmpty()) {
            if (stack.peek().isInteger()) {
                return true;
            }

            List<NestedInteger> list = stack.pop().getList();

            for (int i = list.size() - 1; i >= 0; i--) {
                stack.push(list.get(i));
            }

        }
        return false;
    }

    public Integer next() {
        return stack.pop().getInteger();
    }

    public void remove() {

    }
}