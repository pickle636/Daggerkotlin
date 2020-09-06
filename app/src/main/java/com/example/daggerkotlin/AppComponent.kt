package com.example.daggerkotlin

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules=arrayOf( AndroidInjectionModule::class, ActivityBuilder::class))
interface AppComponent {

    @Component.Builder
    interface Builder
    {
        @BindsInstance
        fun application(application:App): Builder

        fun build(): AppComponent
    }

    fun inject (app:App)
}