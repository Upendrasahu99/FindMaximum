package com.bridgelebz.find_max;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxValueTest {
    @Test
    public void testMax_Int() {
        MaxValue<Integer> maxValue = new MaxValue<>(9, 5, 4);
        Assert.assertEquals((Integer)9, maxValue.findMax());
    }

    @Test
    public void testMax_Float() {
        MaxValue<Float> maxValue = new MaxValue<>(20.4f, 50.4f, 34f);
        Assert.assertEquals((Float)50.4f,  maxValue.findMax());
    }

    @Test
    public void testMax_String(){
        MaxValue<String> maxValue = new MaxValue<>("Taj", "Aman", "Yash");
        Assert.assertEquals((String) "Yash", maxValue.findMax() );
    }
}