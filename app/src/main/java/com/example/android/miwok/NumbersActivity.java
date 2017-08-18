package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //add numbers
        ArrayList<String> numbers = new ArrayList<String>();
        numbers.add("one");
        numbers.add("two");
        numbers.add("three");
        numbers.add("four");
        numbers.add("five");
        numbers.add("six");
        numbers.add("seven");
        numbers.add("eight");
        numbers.add("nine");
        numbers.add("ten");

        //get the root view and add child views to it
        LinearLayout rootView = (LinearLayout)findViewById(R.id.activity_numbers);

        int i;
        for(i = 0; i < numbers.size(); i++)
        {
            TextView numbersView = new TextView(this);
            numbersView.setText(numbers.get(i));
            //adding child view to rootview
            rootView.addView(numbersView);
        }

    }
}
