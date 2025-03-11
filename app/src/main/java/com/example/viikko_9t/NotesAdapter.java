package com.example.viikko_9t;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.NoteViewHolder> {
    private final ArrayList<Note> notes;

    public NotesAdapter(ArrayList<Note> notes) {
        this.notes = notes;
    }

    @Override
    public NoteViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.note_item, parent, false);
        return new NoteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NoteViewHolder holder, int position) {
        Note note = notes.get(position);
        holder.noteIdText.setText(String.valueOf(note.id));
        holder.noteTimeAndDateText.setText(note.timeAndDate);
        holder.noteTitleText.setText(note.title);
        holder.noteContentText.setText(note.content);
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }

    static class NoteViewHolder extends RecyclerView.ViewHolder {
        TextView noteIdText, noteTimeAndDateText, noteTitleText, noteContentText;

        public NoteViewHolder(View itemView) {
            super(itemView);
            noteIdText = itemView.findViewById(R.id.NoteIdText);
            noteTimeAndDateText = itemView.findViewById(R.id.NoteTimeAndDateText);
            noteTitleText = itemView.findViewById(R.id.NoteTitleText);
            noteContentText = itemView.findViewById(R.id.NoteContentText);
        }
    }
}

