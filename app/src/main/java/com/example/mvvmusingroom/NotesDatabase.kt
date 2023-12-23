package com.example.mvvmusingroom

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [Notes::class], version = 1)
 abstract class NotesDatabase : RoomDatabase(){

     abstract  fun notesDao():NotesDaa
   // lateinit var database: NotesDatabase


     companion object{


         fun getDatabse(context:Context):NotesDatabase {
             var database = Room.databaseBuilder(context,
                 NotesDatabase::class.java,
                 name = "notesDB").build()

             return database

         }


         //@Volatile
        // private  var INSTANCE : NotesDatabase? =null


        // fun getDatabse(context:Context):NotesDatabase {

             //if (INSTANCE == null) {

            //   INSTANCE == Room.databaseBuilder(
             //      context,
             //      NotesDatabase::class.java,
                //   name = "notesDB"

              // )

         // }
            // return INSTANCE!!
         }
     }
//}




