package com.spacex.app

import io.reactivex.observers.DisposableObserver

/**
 * Default [DisposableObserver] base class to be used whenever you want default error handling.
 */
abstract class DefaultObserver<T>(
) : DisposableObserver<T>() {

    override fun onComplete() {
        // no-op by default.
    }

    override fun onError(t: Throwable) {
        t
    }

    abstract fun onError(e: String)


}
