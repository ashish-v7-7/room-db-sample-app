package com.protium.roomdbsampleapp.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.protium.roomdbsampleapp.dao.BookDao
import com.protium.roomdbsampleapp.model.Book


@Database(entities = [Book::class], version = 1)
abstract class BookDatabase : RoomDatabase() {
    abstract fun bookDao(): BookDao
}