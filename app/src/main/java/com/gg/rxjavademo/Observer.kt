package com.gg.rxjavademo

interface Observer<T> {

    fun onNext(item: T)

    fun onSubscribe()

    fun onError(e: Throwable)

    fun onComplete()
}