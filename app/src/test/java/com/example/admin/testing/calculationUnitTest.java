package com.example.admin.testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Admin on 8/29/2017.
 */

public class calculationUnitTest {

    Calculation calculation;
    Addition addition;
    Subtraction subtraction;
    Multiplication multiplication;
    Division division;
    @Before
    public void Setup(){
        addition = mock(Addition.class);
        calculation = new Calculation(addition,subtraction,multiplication,division);
        calculation.setVal1(9);
        calculation.setVal2(9);

    }
    @Test
    public void test_add_should_add_two_numbers(){
        when(addition.add(9,9)).thenReturn(27);
        assertEquals(calculation.add(),18);

    }
    @Test
    public void test_add_should_subtract_two_numbers(){
        when(addition.add(9,9)).thenReturn(27);
        assertEquals(calculation.add(),0);

    }
    @Test
    public void test_add_should_multiply_two_numbers(){
        when(addition.add(9,9)).thenReturn(27);
        assertEquals(calculation.add(),81);

    }
    @Test
    public void test_add_should_add_divide_numbers(){
        when(addition.add(9,9)).thenReturn(27);
        assertEquals(calculation.add(),1);

    }
    @After
    public void testDown(){
        calculation.clear();
    }
}
