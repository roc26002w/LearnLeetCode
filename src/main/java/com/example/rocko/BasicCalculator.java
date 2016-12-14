package com.example.rocko;

import java.util.Stack;

/**
 * Created by Rocko on 2016/12/14.
 */
public class BasicCalculator {

    public int calculate(String s) {

        int result = 0;

        int sign = 1;

        Stack<Integer> stack =  new Stack();

        for (int i = 0 ; i < s.length() ; i ++){

            if(Character.isDigit(s.charAt(i))){
                System.out.println(s.charAt(i));
                result += sign * Character.getNumericValue(s.charAt(i));
            } else if(String.valueOf(s.charAt(i)).equals("+")){
                sign = 1;

            } else if(String.valueOf(s.charAt(i)).equals("-")){
                sign = -1;

            } else if(String.valueOf(s.charAt(i)).equals("(")){
                stack.push(result);
                stack.push(sign);
                sign = 1;
                result = 0;

            } else if(String.valueOf(s.charAt(i)).equals(")")){
                result =  stack.pop() * result + stack.pop();
            }

        }

        System.out.println(result);

        return result;
    }
}
