package com.example.test_hilt.di

import com.example.data.database.LogRepository
import com.example.data.database.LogRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
abstract class LoggingModule {

    @Singleton
    @Binds
    abstract fun bindDbLogger(impl: LogRepositoryImpl): LogRepository
}