package com.sabira.dagger

import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import javax.inject.Inject

class App: DaggerApplication() {
    @Inject lateinit var gitHubService: GithubService

    override fun onCreate() {
        super.onCreate()
        configureDagger()
    }

    override fun applicationInjector(): AndroidInjector<App> {
        return DaggerAppComponent.builder()
            .build()
    }

    private fun configureDagger() {
        DaggerAppComponent.builder()
            .build()
            .inject(this)
    }


}