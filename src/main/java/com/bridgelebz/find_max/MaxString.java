package com.bridgelebz.find_max;

public class MaxString {
    private String input1;
    private String input2;
    private String input3;

    MaxString(String input1, String input2, String input3){
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = input3;
    }

    public String findMaxString(){
        String maxString = input1;
        if(input2.compareTo(maxString) > 0){
            maxString = input2;
        }
        if(input3.compareTo(maxString) > 0){
            maxString = input3;
        }
        return maxString;
    }
}
