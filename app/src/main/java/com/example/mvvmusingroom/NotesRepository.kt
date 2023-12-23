package com.example.mvvmusingroom

import androidx.lifecycle.LiveData

class NotesRepository(private  val notesDaa: NotesDaa) {

    suspend fun inserNote(notes: Notes)
    {
        notesDaa.inserNotes(notes)
    }
    fun getNotes():LiveData<List<Notes>>
    {
        return notesDaa.getNotes()
    }
}