package com.example.viikko_9t;

import java.util.ArrayList;

public class NoteStorage {
    private static NoteStorage instance;
    private final ArrayList<Note> notes = new ArrayList<>();

    private NoteStorage() {}

    public static NoteStorage getInstance() {
        if (instance == null) {
            instance = new NoteStorage();
        }
        return instance;
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }

    public void addNote(Note note) {
        notes.add(note);
    }
}
