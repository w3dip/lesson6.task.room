package ru.sberbank.lesson6.task.room.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import ru.sberbank.lesson6.task.room.adapters.NoteEntry;

@Dao
public interface NoteDao {
    @Query("SELECT * from notes")
    LiveData<List<NoteEntry>> getAll();

    @Insert
    void insert(NoteEntry note);

    @Update
    void update(NoteEntry note);
}
