package com.spacex.app

import android.app.Application
import android.webkit.WebView
import com.facebook.drawee.backends.pipeline.Fresco
import com.facebook.imagepipeline.backends.okhttp3.OkHttpImagePipelineConfigFactory
import com.spacex.BuildConfig
import dagger.hilt.android.HiltAndroidApp
import okhttp3.OkHttpClient
import timber.log.Timber
import javax.inject.Inject
import javax.inject.Named

@HiltAndroidApp
class App : Application()
{

    @Inject
    @Named("Api")
    lateinit var okHttpClient: OkHttpClient

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
        initFrescoWithOkHttp()
    }

    private fun initFrescoWithOkHttp() {
        val config = OkHttpImagePipelineConfigFactory
            .newBuilder(this, okHttpClient)
            .setDownsampleEnabled(true)
            .build()
        Fresco.initialize(this, config)
    }

}