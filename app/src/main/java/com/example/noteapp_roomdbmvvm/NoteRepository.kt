package com.example.noteapp_roomdbmvvm

import androidx.lifecycle.LiveData
import com.example.noteapp_roomdbmvvm.Entity.Note
import com.example.noteapp_roomdbmvvm.database.NoteDatabase

class NoteRepository(
    private val noteDatabase: NoteDatabase
) {

    suspend fun insertNote(note: Note) = noteDatabase.getNoteDao().insertNote(note)

    suspend fun updateNote(note: Note) = noteDatabase.getNoteDao().updateNote(note)

    suspend fun deleteNote(note: Note) = noteDatabase.getNoteDao().deleteNote(note)

    suspend fun deleteNoteById(id: Int) = noteDatabase.getNoteDao().deleteNoteById(id)

    suspend fun clearNote() = noteDatabase.getNoteDao().clearNote()

    fun getAllNotes(): LiveData<List<Note>> = noteDatabase.getNoteDao().getAllNotes()
}