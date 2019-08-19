package com.gg.rxjavademo

abstract class Observable<T> : ObservableSource<T> {


    companion object {
        fun <T> just(item: T): Observable<T> = ObservableJust(item)

    }

    protected abstract fun subscribeActual(observer: Observer<in T>)

    override fun subsrcribe(observer: Observer<in T>) {
        subscribeActual(observer)
    }

}