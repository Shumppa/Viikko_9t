package com.example.viikko_9t;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addNoteActivityButton = findViewById(R.id.AddNoteActivityButton);
        Button listNotesActivityButton = findViewById(R.id.ListNotesActivityButton);

        addNoteActivityButton.setOnClickListener(v -> startActivity(new Intent(this, AddNoteActivity.class)));
        listNotesActivityButton.setOnClickListener(v -> startActivity(new Intent(this, ListNotesActivity.class)));
    }
}