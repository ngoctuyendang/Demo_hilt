package com.example.data.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): com.example.data.database.AppDatabase {
        return Room.databaseBuilder(context, com.example.data.database.AppDatabase::class.java, "logging.db").build()
    }

    @Provides
    @Singleton
    fun provideDao(database: com.example.data.database.AppDatabase): com.example.data.database.LogDao {
        return database.logDAO()
    }
}