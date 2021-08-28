package com.example.android.skribblr.data

import android.content.res.Resources
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class DataSource(resources: Resources) {
    private val initialSkribblList = skribblsList(resources)
    private val skribblLiveData = MutableLiveData(initialSkribblList)
    val currentList = skribblLiveData.value

    //adds new note to list
    fun addSkribble(skribbl: Skribbl){
        if (currentList == null){
            skribblLiveData.postValue(listOf(skribbl))
        }else{
            val updatedList=currentList.toMutableList()
            updatedList.add(0,skribbl)
            skribblLiveData.postValue(updatedList)
        }
    }

    fun removeSkribble(skribbl: Skribbl){
        if (currentList != null){
            val updatedList=currentList.toMutableList()
            updatedList.remove(skribbl)
            skribblLiveData.postValue(updatedList)
        }
    }

    fun getSkribblByID(id:Long): Skribbl?{
        skribblLiveData.value?.let{ skribbl->
            return skribbl.firstOrNull{(it.id == id)}
        }
        return null
    }

    fun getSkribblList():LiveData<List<Skribbl>>{
        return skribblLiveData
    }
    companion object {
        private var INSTANCE: DataSource? = null

        fun getDataSource(resources: Resources): DataSource {
            return synchronized(DataSource::class) {
                val newInstance = INSTANCE ?: DataSource(resources)
                INSTANCE = newInstance
                newInstance
            }
        }
    }

}
