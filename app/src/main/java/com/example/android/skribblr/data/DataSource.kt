package com.example.android.skribblr.data

<<<<<<< HEAD
class DataSource {
    fun skribblList(): MutableList<String> {
        return mutableListOf()
    }
}
=======
data class DataSource(var notes: String)  {
//takes in user input as a string
   fun skribblList(): MutableList<String>{
        val tempList=mutableListOf("Wash dishes", "Clean clothes", "Wash car", "Finish project")
       return tempList
   // return mutableListOf<String>(notes)
   }

}
>>>>>>> 827e3d5f3e51a199907a680a70d0b0c47d816274
