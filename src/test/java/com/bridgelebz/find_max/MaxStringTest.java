package com.bridgelebz.find_max;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxStringTest {

    @Test
    public  void testFindMax_FindMax(){
        MaxString maxString = new MaxString("Vinod","Raja", "Ashok");
        String expectedValue = "Vinod";
        String actualValue = maxString.findMaxString();
        Assert.assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testFindMax_SecondMax(){
        MaxString maxString = new MaxString("Jay", "Rajesh", "Ajay");
        String expectedValue = "Rajesh";
        String actualValue = maxString.findMaxString();
        Assert.assertEquals(expectedValue, actualValue);
    }
    @Test
    public void testFindMax_ThirdMax(){
        MaxString maxString = new MaxString("Ayush", "Chintu", "Vicky");
        String expectedValue = "Vicky";
        String actualValue = maxString.findMaxString();
        Assert.assertEquals(expectedValue, actualValue);
    }

}