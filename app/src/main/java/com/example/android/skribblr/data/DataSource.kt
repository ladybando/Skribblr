package com.example.android.skribblr.data

import android.content.res.Resources
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

import android.content.res.Resources
import com.example.android.stickies.R
import java.util.*

class DataSource{
    fun skribblsList(resources : Resources):  MutableList<Skribbl> {
        return mutableListOf(
            Skribbl(
                title = "",
                date = Date(8 / 28 / 2020.toLong()),
                note = resources.getString(R.string.skribbl1),
                urgency = "Low"
            ),
            Skribbl(
                title = "",
                date = Date(8 / 28 / 2020.toLong()),
                note = resources.getString(R.string.skribbl2),
                urgency = "Medium"
            ),
            Skribbl(
                title = "",
                date = Date(8 / 28 / 2020.toLong()),
                note = resources.getString(R.string.skribbl3),
                urgency = "Low"
            ),
            Skribbl(
                title = "hate laundry",
                date = Date(8 / 28 / 2020.toLong()),
                note = resources.getString(R.string.skribbl4),
                urgency = "Low"
            ),
            Skribbl(
                title = "",
                date = Date(8 / 28 / 2020.toLong()),
                note = resources.getString(R.string.skribbl5),
                urgency = "Low"
            )
        )
    }

