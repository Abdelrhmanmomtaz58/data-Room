package com.momtaz.dataroom.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.momtaz.dataroom.data.Note
import com.momtaz.dataroom.viewModel.NoteRepository

class NoteViewModel:ViewModel() {
    val newNoteText = MutableLiveData<String>()
   val repository = NoteRepository()
    fun addNote(){
        repository.insert(Note(1,"hi ","52/5/2020",true))
    }


}