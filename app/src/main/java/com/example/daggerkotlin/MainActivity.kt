package com.example.daggerkotlin

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var app :Context

    private lateinit var pref:SharedPreferences
    private val APP_PREFERENCES = "mySettings"
    private val App_PREFERENCES_COUNTER = " counter"
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "SharedPreferences"
        pref = getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE)

        button.setOnClickListener{
            counter++
        }
    }

    override fun onPause(){
        super.onPause()

        // Запоминаем данные
        val editor = pref.edit()
        editor.putInt(App_PREFERENCES_COUNTER,counter)
        editor.apply()
    }

    override fun onResume() {
        super.onResume()

        if (pref.contains(App_PREFERENCES_COUNTER)){
            // Получаем число из настроек
            counter = pref.getInt(App_PREFERENCES_COUNTER,0);
            // Выводим на экран данные из настроек
            text.setText("$counter")
        }

    }

}