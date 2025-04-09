package com.example.myandroidapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainActivityTest {

    @Test
    public void testGreetUserFromMainActivity() {
        MainActivity activity = new MainActivity();
        String greeting = activity.greetUser("Majid");
        assertEquals("Hello, Majid!", greeting);
    }

    @Test
    public void testOnCreate() {
        MainActivity activity = new MainActivity();
        activity.onCreate(null);  // triggers onCreate, even though it's minimal
    }
}
