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

        Button addNoteButton = findViewById(R.id.lisaaMuistilaput);
        Button listNotesButton = findViewById(R.id.listaaMuistilaput);

        addNoteButton.setOnClickListener(v -> startActivity(new Intent(this, AddNoteActivity.class)));
        listNotesButton.setOnClickListener(v -> startActivity(new Intent(this, ListNotesActivity.class)));
    }
}