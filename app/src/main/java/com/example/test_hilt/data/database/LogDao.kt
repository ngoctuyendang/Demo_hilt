package com.example.test_hilt.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.test_hilt.data.entities.Log

//@Dao
//interface LogDao {
//
//    @Insert
//    fun insertAll(vararg logs: Log)
//
//    @Query("SELECT * FROM logs ORDER BY id DESC")
//    fun getAllLog(): List<Log>
//
//    @Query("DELETE FROM LOGS")
//    fun deleteAll()
//}