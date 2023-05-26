package com.bridgelebz.find_max;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MaxIntTest {
    @Test
    public  void testFindMax_FirstMax(){
        MaxInt maxInt = new MaxInt(7,4,5);
        Integer expectedMaxValue = 7;
        Integer actualMaxValue = maxInt.findMaxInt();
        Assert.assertEquals(expectedMaxValue,actualMaxValue);
    }
    @Test
    public  void testFindMax_SecondMax(){
        MaxInt maxInt = new MaxInt(23,45,33);
        Integer expectedMaxValue = 45;
        Integer actualMaxValue = maxInt.findMaxInt();
        Assert.assertEquals(expectedMaxValue,actualMaxValue);
    }
    @Test
    public  void testFindMax_ThirdMax(){
        MaxInt maxInt = new MaxInt(3,6,9);
        Integer expectedMaxValue = 9;
        Integer actualMaxValue = maxInt.findMaxInt();
        Assert.assertEquals(expectedMaxValue,actualMaxValue);
    }

}