package com.example.android.skribblr.data


import java.util.Date

data class Skribbl(
        val title: String,
        val date: Date,
        val note: String,
        val urgency: String
)
