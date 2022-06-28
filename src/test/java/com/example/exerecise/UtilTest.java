package com.example.exerecise;

import com.example.exercise.Util;
import org.junit.Assert;
import org.junit.Test;

public class UtilTest {

    @Test
    public void testCountBackwards(){
        Util util = new Util();

        util.countBackwards(3, 1);
        Assert.assertEquals(1, util.getCountNumberDivisibleBy3());

        util.countBackwards(15,10);
        Assert.assertEquals(1, util.getCountNumberDivisibleBy3And5());
        Assert.assertEquals(1, util.getCountNumberDivisibleBy5());

    }
}
