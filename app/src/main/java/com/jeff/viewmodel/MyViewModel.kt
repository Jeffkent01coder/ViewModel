package com.jeff.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    //livedata
    private val countLiveData = MutableLiveData<Int>()

    //initialize the count value
    init {
        countLiveData.value = 0
    }

    val counterLiveData: LiveData<Int>
        get() = countLiveData

    fun incrementCounter() {
        countLiveData.value = (countLiveData.value ?: 0) + 1

    }

    fun decrementCounter() {
        countLiveData.value = (countLiveData.value ?: 0) - 1
    }


//    private var counter = 0
//
//    fun getInitialCounter(): Int {
//        return counter
//    }
//
//    fun getUpdatedCounter(): Int {
//        return ++counter
//    }
//
//    fun getSubtractCounter(): Int {
//        return --counter
//    }

}