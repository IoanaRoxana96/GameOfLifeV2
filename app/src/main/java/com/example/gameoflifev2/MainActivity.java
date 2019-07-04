package com.example.gameoflifev2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // click-handlers for buttons
        View newButton = findViewById(R.id.new_button);
        newButton.setOnClickListener(this);

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.new_button:
                Intent gridIntent = new Intent(this, GridActivity.class);
                startActivity(gridIntent);
                break;
        }
    }
}
