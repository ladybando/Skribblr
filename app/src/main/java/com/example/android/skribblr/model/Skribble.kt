package com.example.android.skribblr.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.net.IDN

//TODO continue implementing rooms to replace SQL API's  https://github.com/codepath/android_guides/wiki/Room-Guide
data class Skribble (@PrimaryKey(autoGenerate = true) val stringResourceID: Int,
                     private val note: String,
                     private val task: String) {

}
