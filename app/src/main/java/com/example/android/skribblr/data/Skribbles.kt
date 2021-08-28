package com.example.android.skribblr.data

import android.content.res.Resources
import com.example.android.skribblr.R
import java.util.*

fun skribblesList(resources : Resources):  List<Skribble>{
    return listOf(
        Skribble(
            id = 1,
            date = Date(8/28/2020),
            note = resources.getString(R.string.skribble1),
            urgency = "Low"
        ),
        Skribble(
            id = 2,
            date = Date(8/28/2020),
            note = resources.getString(R.string.skribble2),
            urgency = "Low"
        ),
        Skribble(
            id = 3,
            date = Date(8/28/2020),
            note = resources.getString(R.string.skribble3),
            urgency = "Low"
        ),
        Skribble(
            id = 4,
            date = Date(8/28/2020),
            note = resources.getString(R.string.skribble4),
            urgency = "Low"
        ),
        Skribble(
            id = 5,
            date = Date(8/28/2020),
            note = resources.getString(R.string.skribble5),
            urgency = "Low"
        )
    )
}
