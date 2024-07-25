package com.momtaz.dataroom.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.momtaz.dataroom.data.Note
import com.momtaz.dataroom.data.NoteDao

@Database(entities = [Note::class], version = 1)
abstract class NoteDatabase : RoomDatabase() {
    abstract fun noteDao(): NoteDao

    companion object {
        private const val DATABASE_NAME = "myNoteDatabase"

        @Volatile private var instance: NoteDatabase? = null
        fun getInstance(context: Context): NoteDatabase {
            return instance ?: synchronized(this){ buildDataBase(context).also { instance=it } }
        }

        private fun buildDataBase(context: Context): NoteDatabase {
            return Room.databaseBuilder(context, NoteDatabase::class.java, DATABASE_NAME).build()
        }
    }
}