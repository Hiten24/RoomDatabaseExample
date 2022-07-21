package com.example.database.ui.data

import android.content.Context
import androidx.room.Room

class Database(
    context: Context
) {

    private val db = Room.databaseBuilder(
        context,
        AppDatabase::class.java,
        "image_database"
    ).build()

    fun getDatabaseDao() = db.imageDao()

}