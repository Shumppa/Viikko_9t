package com.example.viikko_9t;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;


public class AddNoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);

        Button addNoteButton = findViewById(R.id.AddNoteButton);
        EditText titleEdit = findViewById(R.id.TitleEdit);
        EditText contentEdit = findViewById(R.id.ContentEdit);

        addNoteButton.setOnClickListener(v -> {
            String title = titleEdit.getText().toString();
            String content = contentEdit.getText().toString();
            if (!title.isEmpty() && !content.isEmpty()) {
                NoteStorage.getInstance().addNote(new Note(title, content));
                finish();
            }
        });
    }
}
