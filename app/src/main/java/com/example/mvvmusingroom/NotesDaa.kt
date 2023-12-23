package com.example.mvvmusingroom

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.selects.select

@Dao
interface NotesDaa {

    @Insert
    fun inserNotes(notes: Notes)

    @Delete
    fun deleteNotes(notes: Notes)

    @Query("SELECT * FROM notes" )
    fun getNotes():LiveData<List<Notes>>

}