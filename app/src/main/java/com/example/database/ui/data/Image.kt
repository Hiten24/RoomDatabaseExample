package com.example.database.ui.data

import androidx.room.Entity

@Entity(tableName = "image", primaryKeys = ["id", "title"])
data class Image(
    val id: Int,
    val title: String,
    val fileSize: String
)