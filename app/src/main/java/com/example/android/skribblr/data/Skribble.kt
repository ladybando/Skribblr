package com.example.android.skribblr.data;

import java.util.Date;
data class Skribble(
        val id: Long,
        val date:Date,
        val note: String,
        val urgency: String
)
