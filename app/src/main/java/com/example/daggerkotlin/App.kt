package com.example.daggerkotlin


import android.app.Application
import dagger.hilt.android.HiltAndroidApp
@HiltAndroidApp
class App : Application() {
//    @Inject
//    lateinit var activityInjector : DispatchingAndroidInjector<Activity>
//
//    override fun onCreate() {
//        super.onCreate()
//        DaggerAppComponent.builder().application(this).build().inject(this)
//
//    }
//
//override fun activityInjector(): AndroidInjector<Activity> = activityInjector
}