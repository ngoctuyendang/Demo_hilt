package com.example.data.database

import androidx.lifecycle.LiveData
import com.example.data.entities.Log

interface LogRepository {
    fun addLog(msg: String)
    fun getAllLogs(): LiveData<List<Log>>
    fun removeLogs()
}