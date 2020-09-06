package com.example.daggerkotlin

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [AppModule::class])
    abstract fun bindMainActivity (): MainActivity

}