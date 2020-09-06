package com.example.daggerkotlin

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule()
{
    @Provides
    @Singleton
    fun provideApplication(app : App): Context = app

    @Provides
    @Singleton
    fun funCat(): Cat {
        return Cat()
    }


}