package com.example.daggerkotlin

import javax.inject.Inject

class Dog @Inject constructor(var cat: Cat) {

}