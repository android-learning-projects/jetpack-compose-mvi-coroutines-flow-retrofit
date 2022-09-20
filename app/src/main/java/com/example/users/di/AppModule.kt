package com.example.users.di

import android.app.Application
import com.example.users.data.remote.UserAPI
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideUserApi():UserAPI{
        return Retrofit
            .Builder()
            .baseUrl("https://gorest.co.in/public/v2/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create()
    }

}