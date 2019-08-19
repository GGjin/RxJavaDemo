package com.gg.rxjavademo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.IntegerRes
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.disposables.Disposable

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Observable.just("aaa")
            .subscribe(object : Observer<String> {
                override fun onComplete() {
                    Log.w("onComplete", "onComplete")

                }

                override fun onSubscribe(d: Disposable) {
                    Log.w("onSubscribe", "onSubscribe")
                }

                override fun onNext(t: String) {
                    Log.w("onNext", "onNext")

                }

                override fun onError(e: Throwable) {
                    Log.w("onError", "onError")

                }

            })


        com.gg.rxjavademo.Observable.just("aaa")
            .subsrcribe(object : com.gg.rxjavademo.Observer<String> {
                override fun onNext(item: String) {
                    Log.w("onNext", "onNext" + item)
                    Integer.parseInt(item)
                }

                override fun onSubscribe() {
                    Log.w("onSubscribe", "onSubscribe")

                }

                override fun onError(e: Throwable) {
                    Log.w("onError", "onError" + e.printStackTrace())
                }

                override fun onComplete() {
                    Log.w("onComplete", "onComplete")
                }

            })
    }
}
