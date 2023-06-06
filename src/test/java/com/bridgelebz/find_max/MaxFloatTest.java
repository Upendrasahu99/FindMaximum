package com.bridgelebz.find_max;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MaxFloatTest {

    @Test
    public void testFindMax_FirstMax(){
        MaxFloat maxFloat = new MaxFloat(52.5f, 40.8f, 11.9f);
        Float expectedMaxValue = 52.5f;
        Float actualMaxValue = maxFloat.findMaxFloat();
        Assert.assertEquals(expectedMaxValue, actualMaxValue);
    }

    @Test
    public void testFindMax_SecondMax(){
        MaxFloat maxFloat = new MaxFloat(3.4f,45.7f, 20.3f);
        Float expectedMaxValue = 45.7f;
        Float actualMaxValue = maxFloat.findMaxFloat();
        Assert.assertEquals(expectedMaxValue, actualMaxValue);
    }

    @Test
    public void testFindMax_ThirdMax(){
        MaxFloat maxFloat = new MaxFloat(22.4f, 34.5f, 66.4f);
        Float expectedMaxValue = 66.4f;
        Float actualMaxValue = maxFloat.findMaxFloat();
        Assert.assertEquals(expectedMaxValue, actualMaxValue);
    }
}