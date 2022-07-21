package com.example.database.ui.data

import androidx.room.Insert
import androidx.room.Query

interface ImageDao {

    @Insert
    fun insert(image: Image)

    @Query("SELECT * FROM image")
    fun getAllImages(): List<Image>

}