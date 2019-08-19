package com.gg.rxjavademo

interface ObservableSource<T> {

    fun subsrcribe(observer: Observer<in T>)
}