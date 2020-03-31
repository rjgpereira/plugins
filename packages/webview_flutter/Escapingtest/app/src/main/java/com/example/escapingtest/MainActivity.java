package com.example.escapingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import org.apache.commons.text.StringEscapeUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String test = "\u003Cp>paragraph\u003C/p>";

        String str = StringEscapeUtils.unescapeJava(test);

        Log.d("_TEST", str);
    }
}
