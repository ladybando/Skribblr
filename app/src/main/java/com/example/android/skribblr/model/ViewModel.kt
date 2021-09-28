package com.example.android.skribblr.model

import androidx.lifecycle.ViewModel

class ViewModel: ViewModel() {

    private var _userInput: String = "Sample text"
    private val userInput: String
        get() = _userInput

    private var _taskList: MutableList<String> = mutableListOf()
    val taskList: MutableList<String>
        get() = _taskList


    fun addNewTask(){
        _taskList = mutableListOf(userInput)
    }
}