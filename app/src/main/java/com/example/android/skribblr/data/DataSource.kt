package com.example.android.skribblr.data

data class DataSource(var notes: String)  {
//takes in user input as a string

    //should function also accept a string as an argument? note?
   fun skribblList(): MutableList<String>{
        val tempList=mutableListOf("Wash dishes", "Clean clothes", "Wash car", "Finish project")
       return tempList
   // return mutableListOf<String>(notes)
   }

}
