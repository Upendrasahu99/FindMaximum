package com.bridgelebz.find_max;

public class MaxInt {
    Integer input1;
    Integer input2;
    Integer input3;

    MaxInt(Integer input1, Integer input2, Integer input3) {
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = input3;
    }

    public Integer findMax() {
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

