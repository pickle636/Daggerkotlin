package com.example.daggerkotlin

import javax.inject.Inject

data class Cat @Inject constructor(val name: String = "barsik") {
}