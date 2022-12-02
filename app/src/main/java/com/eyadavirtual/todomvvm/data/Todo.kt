package com.eyadavirtual.todomvvm.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Todo(
    val title:String,
    val description : String?,
    val isDone :Boolean,
    // Room handle this
  @PrimaryKey val id: Int? = null

)
