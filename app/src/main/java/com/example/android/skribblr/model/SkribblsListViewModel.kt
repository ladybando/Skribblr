package com.example.android.skribblr.model

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.android.skribblr.data.DataSource
import com.example.android.skribblr.data.Skribbl
import java.lang.IllegalArgumentException
import java.util.*
import kotlin.random.Random

class SkribblsListViewModel(val dataSource: DataSource) : ViewModel() {

    val skribbleLiveData = dataSource.getSkribblList()

    fun insertSkribbl(skribTitle: String?, skribDescription: String?){
        if (skribTitle == null && skribDescription == null){
            return
        }
        val newSkribbl = Skribbl(
            Random.nextLong(),
            date = Date(),
            skribDescription!!,
            urgency = String()
        )
        dataSource.addSkribble(newSkribbl)
    }

    class SkribblsListViewModel(private val context: Context) : ViewModelProvider.Factory{
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(SkribblsListViewModel::class.java)){
                @Suppress("UNCHECKED_CAST")
                return SkribblsListViewModel(
                    dataSource = DataSource.getDataSource(context.resources)
                ) as T
            }
            throw IllegalArgumentException("Unknown ViewModel class")
        }
    }

}
