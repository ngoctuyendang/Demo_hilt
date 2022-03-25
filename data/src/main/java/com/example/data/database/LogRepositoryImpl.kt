package com.example.data.database

import androidx.lifecycle.LiveData
import com.example.data.entities.Log
import javax.inject.Inject

class LogRepositoryImpl @Inject constructor(private val logDao: LogDao) : LogRepository {
    override fun addLog(msg: String) {
        logDao.insertAll(Log(msg, System.currentTimeMillis().toString()))
    }

    override fun getAllLogs(): LiveData<List<Log>> {
       return logDao.getAllLog()
    }

    override fun removeLogs() {
        logDao.deleteAll()
    }
}