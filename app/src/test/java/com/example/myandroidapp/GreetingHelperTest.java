package com.example.myandroidapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class GreetingHelperTest {
    @Test
    public void testGreeting() {
        GreetingHelper helper = new GreetingHelper();
        String greeting = helper.greetUser("Majid");
        assertEquals("Hello, Majid!", greeting);
    }
}
