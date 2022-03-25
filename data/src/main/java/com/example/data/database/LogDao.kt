package com.example.data.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.data.entities.Log

@Dao
interface LogDao {

    @Insert
    fun insertAll(logs: Log)

    @Query("SELECT * FROM logs ORDER BY id DESC")
    fun getAllLog(): LiveData<List<Log>>

    @Query("DELETE FROM logs")
    fun deleteAll()

}