package com.bridgelebz.find_max;

public class MaxInt {
    private Integer input1;
    private Integer input2;
    private Integer input3;

    MaxInt(Integer input1, Integer input2, Integer input3) {
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = input3;
    }

     Integer findMaxInt() {
        Integer maxValue = input1;
        if (input2.compareTo(maxValue) > 0) {
            maxValue = input2;
        }
        if (input3.compareTo(maxValue) > 0) {
            maxValue = input3;
        }
        return maxValue;
    }
}

