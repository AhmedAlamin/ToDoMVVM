package com.eyadavirtual.todomvvm.di

import android.app.Application
import androidx.room.Room
import androidx.room.RoomDatabase
import com.eyadavirtual.todomvvm.data.TodoDatabase
import com.eyadavirtual.todomvvm.data.TodoRepository
import com.eyadavirtual.todomvvm.data.TodoRepositoryImplmentation
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideTodoDatabase(app : Application) : TodoDatabase {
        return Room.databaseBuilder(
            app,
            TodoDatabase::class.java,
            "todo_db"
        ).build()
    }


    @Provides
    @Singleton
    fun provideTodoRepository(db:TodoDatabase) :TodoRepository {
        return TodoRepositoryImplmentation(db.dao)
    }



}