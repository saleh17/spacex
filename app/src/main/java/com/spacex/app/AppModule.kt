package com.spacex.app

import android.app.Application
import com.spacex.data.DataModule
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module(includes = [ DataModule::class])
object AppModule {

    @Provides
    @Singleton
    internal fun provideApp(application: Application): App = application as App

    @Provides
    @Singleton
    internal fun provideExecutionSchedulers(): ExecutionSchedulers = DefaultSchedulers()

}