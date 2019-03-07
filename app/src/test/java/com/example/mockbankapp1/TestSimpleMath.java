package com.example.mockbankapp1;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestSimpleMath {
    //Add @Before and @After tags of functions that initialize and clean up.


    @Test
    public void addition_isCorrect() {
        assertEquals(4,2+2);
    }

    @Test
    public void TestIncreaseByTwo(){
        SimpleMath hello = new SimpleMath();
        assertEquals("We failed. Expected was 4", 4, hello.IncreaseByTwo(2));
    }
}
