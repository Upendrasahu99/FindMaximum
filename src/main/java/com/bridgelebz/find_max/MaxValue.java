package com.bridgelebz.find_max;

public class MaxValue <T extends  Comparable<T>>  {
    private T input1;
    private T input2;
    private T input3;

    MaxValue(T input1, T input2, T input3){
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = input3;
    }


    public T findMax(){
        T maxValue = input1;
        if(input2.compareTo(maxValue) > 0){
            maxValue = input2;
        }
        if(input3.compareTo(maxValue)  > 0) {
            maxValue = input3;
        }
        return maxValue;
    }
}
