package com;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;

public class CalcTest {

    @Test
    public void sumTest() {
        Assert.assertTrue(Calc.sum(new BigDecimal("3"), new BigDecimal("6")).equals(new BigDecimal(9)),
                "sum have wrong result");
    }
}