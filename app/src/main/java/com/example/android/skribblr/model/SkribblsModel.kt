package com.example.android.skribblr.model

import android.content.res.Resources
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.android.stickies.data.DataSource
import com.example.android.stickies.data.Skribbl
import java.util.*

class SkribblsModel(val resources: Resources) : ViewModel() {

    private val initialSkribblList = DataSource().skribblsList(resources)
    private val skribblLiveData = MutableLiveData(initialSkribblList)
    val currentList = skribblLiveData.value

    //adds new note to list
    fun addSkribble(skribbl: Skribbl) {
        if (currentList == null) {
            skribblLiveData.postValue(mutableListOf(skribbl))
        } else {
            val updatedList = currentList.toMutableList()
            updatedList.add(0, skribbl)
            skribblLiveData.postValue(updatedList)
        }
    }

    fun removeSkribble(skribbl: Skribbl) {
        if (currentList != null) {
            val updatedList = currentList.toMutableList()
            updatedList.remove(skribbl)
            skribblLiveData.postValue(updatedList)
        }
    }

    fun getSkribblByID(date: Date): Skribbl? {
        skribblLiveData.value?.let { skribbl ->
            return skribbl.firstOrNull { (it.date == date) }
        }
        return null
    }

    fun getSkribblList(): LiveData<MutableList<Skribbl>> {
        return skribblLiveData
    }

}
