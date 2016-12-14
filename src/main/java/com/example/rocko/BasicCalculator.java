package com.example.rocko;

/**
 * Created by Rocko on 2016/12/14.
 */
public class BasicCalculator {

    public int calculate(String s) {

        int result = 0;

        int sign = 1;

        for (int i = 0 ; i < s.length() ; i ++){

            if(Character.isDigit(s.charAt(i))){
                System.out.println(s.charAt(i));
                result += sign * Character.getNumericValue(s.charAt(i));
            } else if(String.valueOf(s.charAt(i)).equals("+")){
                sign = 1;

            } else if(String.valueOf(s.charAt(i)).equals("-")){
                sign = -1;
            }

        }
        System.out.println(result);

        return result;
    }
}
