package com.eyadavirtual.todomvvm.data

import androidx.room.PrimaryKey

data class Todo(
    val title:String,
    val description : String?,
    val isDone :Boolean,
    // Room handle this
  @PrimaryKey val id: Int? = null

)
