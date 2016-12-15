package com.example.rocko;

import java.util.Stack;

/**
 * Created by Rocko on 2016/12/14.
 */
public class BasicCalculator {

    public int calculate(String s) {

        int result = 0;

        int sign = 1;

        int num = 0;

        boolean flag = true;

        String tmp = "";

        Stack<Integer> stack = new Stack();

        for (int i = 0; i < s.length(); i++) {

            Character character = s.charAt(i);

            if (Character.isDigit(character)) {

                if (i == 0) {
                    result = Character.getNumericValue(s.charAt(0));
                }

                if (i - 1 >= 0 && !Character.isDigit(s.charAt(i - 1))) {

                    while ((i + num) < s.length() && Character.isDigit(s.charAt(i + num))) {
                        num++;
                    }

                    result += sign * Integer.parseInt(s.substring(i, i + num));
                    num = 0;
                }

                tmp += character;
            } else if (String.valueOf(character).equals("(")) {
                stack.push(result);
                stack.push(sign);
                sign = 1;
                result = 0;
                flag = false;

            } else if (String.valueOf(character).equals(")")) {
                result = stack.pop() * result + stack.pop();
                flag = false;

            } else if (String.valueOf(character).equals("+")) {
                sign = 1;
                flag = false;

            } else if (String.valueOf(character).equals("-")) {
                sign = -1;
                flag = false;

            }

        }


        if (flag == true) {
            result = Integer.valueOf(tmp).intValue();
        }

        return result;
    }
}
