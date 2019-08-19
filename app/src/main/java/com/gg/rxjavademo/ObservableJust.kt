package com.gg.rxjavademo

import java.lang.Exception

class ObservableJust<T>(private val item: T) : Observable<T>() {
    override fun subscribeActual(observer: Observer<in T>) {
        val scalarDisposable = ScalarDisposable(observer, item)
        scalarDisposable.run()
    }

    class ScalarDisposable<T>(val observer: Observer<in T>, val item: T) {

        fun run() {
            observer.onSubscribe()

            try {
                observer.onNext(item)
            } catch (e: Exception) {
                observer.onError(e)
            }
            observer.onComplete()
        }

    }

}