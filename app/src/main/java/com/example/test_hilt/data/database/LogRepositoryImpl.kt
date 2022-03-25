package com.example.test_hilt.data.database

import android.os.Handler
import android.os.Looper
import com.example.test_hilt.data.entities.Log
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import javax.inject.Inject

//class LogRepositoryImpl @Inject constructor(private val logDao: LogDao) : LogRepository {
//
//
//    private val executorService: ExecutorService = Executors.newFixedThreadPool(4)
//    private val mainThreadHandler by lazy {
//        Handler(Looper.getMainLooper())
//    }
//
//    override fun addLog(msg: String) {
//        executorService.execute {
//            android.util.Log.d("xxxxxxx", msg)
//            logDao.insertAll(Log(msg, System.currentTimeMillis().toString()))
//        }
//    }
//
//    override fun getAllLogs(listener: (List<Log>) -> Unit) {
//        executorService.execute {
//            val logs = logDao.getAllLog()
//            mainThreadHandler.post { listener(logs) }
//        }
//    }
//
//    override fun removeLogs() {
//        executorService.execute {
//            logDao.deleteAll()
//        }
//    }
//}