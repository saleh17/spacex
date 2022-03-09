package com.spacex.data


sealed class Resource<out T> {

    class Loading<T>(val data: T? = null) : Resource<T>()

    data class Success<T>(val data: T) : Resource<T>()

    data class Error<T>(
        val message: CharSequence,
        val action: (() -> Unit)? = null
    ) : Resource<T>()
}

