package com.example.daggerkotlin

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class AppModule()
{
//    @Provides
//    @Singleton
//    fun provideApplication(app : App): Context = app

    @Provides
    @Singleton
    fun dog(cat: Cat): Dog = Dog(cat)

    @Provides
    @Singleton
    fun cat(): Cat = Cat()


}