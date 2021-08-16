package com.example.android.skribblr.model

import androidx.room.Entity;
import androidx.room.PrimaryKey

class Users(@PrimaryKey val id: Long, var userID: Int, var userName: String) {
}