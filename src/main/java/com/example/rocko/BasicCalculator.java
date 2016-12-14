package com.example.rocko;

import java.util.Stack;

/**
 * Created by Rocko on 2016/12/14.
 */
public class BasicCalculator {

    public int calculate(String s) {

        int result = 0;

        int sign = 1;

        boolean flag = true;

        String tmp="";

        Stack<Integer> stack = new Stack();

        for (int i = 0; i < s.length(); i++) {

            if (String.valueOf(s.charAt(i)).equals("(")) {
                stack.push(result);
                stack.push(sign);
                sign = 1;
                result = 0;
                flag = false;

            } else if (String.valueOf(s.charAt(i)).equals(")")) {
                result = stack.pop() * result + stack.pop();
                flag = false;

            } else if (String.valueOf(s.charAt(i)).equals("+")) {
                sign = 1;
                flag = false;

            } else if (String.valueOf(s.charAt(i)).equals("-")) {
                sign = -1;
                flag = false;

            } else if (Character.isDigit(s.charAt(i))) {

                tmp += s.charAt(i);
                result += sign * Character.getNumericValue(s.charAt(i));

            }

        }

        if (flag == true) {
            result = Integer.valueOf(tmp).intValue();
        }

        return result;
    }
}
