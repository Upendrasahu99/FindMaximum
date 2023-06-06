package com.bridgelebz.find_max;

public class MaxFloat {
    private Float input1;
    private Float input2;
    private Float input3;

    MaxFloat(Float input1, Float input2, Float input3) {
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = input3;
    }

    public Float findMaxFloat() {
        Float maxValue = input1;
        if (input2.compareTo(maxValue) > 0) {
            maxValue = input2;
        }
        if (input3.compareTo(maxValue) > 0) {
            maxValue = input3;
        }
        return maxValue;
    }
}
