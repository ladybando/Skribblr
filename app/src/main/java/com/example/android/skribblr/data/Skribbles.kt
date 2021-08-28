package com.example.android.skribblr.data

import android.content.res.Resources
import com.example.android.skribblr.R
import java.util.*

fun skribblsList(resources : Resources):  List<Skribbl>{
    return listOf(
        Skribbl(
            id = 1,
            title="",
            date = Date(8/28/2020),
            note = resources.getString(R.string.skribbl1),
            urgency = "Low"
        ),
        Skribbl(
            id = 2,
            title="",
            date = Date(8/28/2020),
            note = resources.getString(R.string.skribbl2),
            urgency = "Low"
        ),
        Skribbl(
            id = 3,
            title="",
            date = Date(8/28/2020),
            note = resources.getString(R.string.skribbl3),
            urgency = "Low"
        ),
        Skribbl(
            id = 4,
            title="hate laundry",
            date = Date(8/28/2020),
            note = resources.getString(R.string.skribbl4),
            urgency = "Low"
        ),
        Skribbl(
            id = 5,
            title="",
            date = Date(8/28/2020),
            note = resources.getString(R.string.skribbl5),
            urgency = "Low"
        )
    )
}
