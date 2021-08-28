package com.example.android.skribblr.data

import java.util.Date;

data class Skribbl(
    val id: Long,
    val title: String,
    val date:Date,
    val note: String,
    val urgency: String
)
