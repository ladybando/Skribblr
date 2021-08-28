package com.example.android.skribblr.data

import android.content.res.Resources
import androidx.lifecycle.MutableLiveData

class DataSource(resources: Resources) {
    private val initialSkribbleList = skribblesList(resources)
    private val skribbleLiveData = MutableLiveData(initialSkribbleList)
    val currentList = skribbleLiveData.value

    //adds new note to list
    fun addSkribble(skribble: Skribble){
        if (currentList == null){
            skribbleLiveData.postValue(listOf(skribble))
        }else{
            val updatedList=currentList.toMutableList()
            updatedList.add(0,skribble)
            skribbleLiveData.postValue(updatedList)
        }
    }

    fun removeSkribble(skribble: Skribble){
        if (currentList != null){

        }
    }
}
