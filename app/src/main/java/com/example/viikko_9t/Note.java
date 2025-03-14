package com.example.viikko_9t;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Note {
    static int counter = 1;
    int Id;
    String title;
    String content;
    String timeAndDate;

    public Note(String title, String content) {
        this.Id = counter++;
        this.title = title;
        this.content = content;
        this.timeAndDate = new SimpleDateFormat("HH:mm dd.MM.yyyy", Locale.getDefault())
                .format(Calendar.getInstance().getTime());
    }
}
