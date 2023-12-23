package com.example.mvvmusingroom

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "notes")
data class Notes(
    @PrimaryKey
    var id:Int,
    val title:String

)
