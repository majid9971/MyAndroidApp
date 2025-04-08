package com.example.myandroidapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private final GreetingHelper greetingHelper = new GreetingHelper();

    public String greetUser(String name) {
        return greetingHelper.greetUser(name);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Optional usage
        String greeting = greetUser("Majid");
    }
}
