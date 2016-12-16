package com.example.rocko;

import java.util.Stack;

/**
 * Created by Rocko on 2016/12/14.
 */
public class BasicCalculator {

    public int calculate(String s) {

        int result = 0;
        int sign = 1;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                int current = ch - '0';
                while (i + 1 < s.length() && Character.isDigit(s.charAt(i + 1))) {
                    current = current * 10 + s.charAt(++i) - '0';
                }
                result = result + sign * current;
            } else if (ch == '+') {
                sign = 1;
            } else if (ch == '-') {
                sign = -1;
            } else if (ch == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (ch == ')') {
                result = stack.pop() * result + stack.pop();
            }
        }

        return result;
    }
}
