package com.eyadavirtual.todomvvm.ui.todo_list

import androidx.lifecycle.ViewModel
import com.eyadavirtual.todomvvm.data.TodoRepository
import com.eyadavirtual.todomvvm.util.UiEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import javax.inject.Inject

@HiltViewModel
class TodoListViewModel @Inject constructor(
    private val repository : TodoRepository
) :ViewModel(){


    val todos = repository.getTodos()

   private val _uiEvent = Channel<UiEvent> {  }

}