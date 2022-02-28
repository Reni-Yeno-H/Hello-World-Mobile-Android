package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = ((TextView) findViewById(R.id.text));

        //User can tap a button to change the text color of the label.
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //User can tap a button to change the text color of the label.
                // # ffcd66 - Gold
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.Gold));
            }
        });

        //User can tap a button to change the color of the background view.
        findViewById(R.id.changeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //User can tap a button to change the color of the background view.
                (findViewById(R.id.parentColor)).setBackgroundColor(getResources().getColor(R.color.teal_700));
            }
        });

        //User can tap a button to change the text string of the label - Android is Awesome!
        findViewById(R.id.changeTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //User can tap a button to change the text string of the label - Android is Awesome!
                ((TextView) findViewById(R.id.text)).setText("Android is Awesome!");
            }
        });

        //User can tap on the background view to reset all views to default settings.
        findViewById(R.id.parentColor).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 1.) Reset the text to "Hello from Hao Ren!" id - @id/text
                ((TextView) findViewById(R.id.text)).setText("Hello from Hao Ren!");

                // 2.) Reset the color of the text to original color
                // Original text color - black, text id - @id/text
                textView.setTextColor(getResources().getColor(R.color.black));

                // 3.) Reset the background color
                // original background color - R.color.Sky_blue
                findViewById(R.id.parentColor).setBackgroundColor(getResources().getColor(R.color.Sky_blue));
            }

        });

        //User can update the label text with custom text entered into the text field.
        //User can tap the “Change text string” button to update the label with the text from the text field.
        findViewById(R.id.changeCustomTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // change the text view to what's in the edit text view
                String userEnteredText = ((EditText) findViewById(R.id.editText)).getText().toString();
                textView.setText(userEnteredText);

                // If the text field is empty, update label with default text string.
                if (userEnteredText.isEmpty()) {
                    textView.setText("Enter your own text!");
                } else {
                    textView.setText(userEnteredText);
                }
            }
        });


    }
}