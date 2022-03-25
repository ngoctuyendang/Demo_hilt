package com.example.test_hilt.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "logs")
data class Log (val msg: String, val times: String) {
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
}