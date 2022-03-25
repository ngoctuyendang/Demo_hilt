package com.example.test_hilt.ui

//import com.example.test_hilt.data.entities.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.database.LogRepository
import com.example.data.entities.Log
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LogViewModel @Inject constructor(private val logRepository: LogRepository) : ViewModel() {

    fun addLog(msg: String) {
        viewModelScope.launch(Dispatchers.IO) {
            logRepository.addLog(msg)
        }
    }

    fun getLog() = logRepository.getAllLogs()

    fun deleteLog() {
        viewModelScope.launch(Dispatchers.IO) {
            logRepository.removeLogs()
        }
    }
}