package com.sabira.dagger

import dagger.Component
import dagger.Module
import dagger.android.AndroidInjector


@Component(
    modules = [
        AndroidInjectModule::class,
        AndroidSupportInjectModule::class,
        ActivityModule::class
    ]
)
interface AppComponent: AndroidInjector<App>{

    @Component.Builder
    interface Builder {
        fun build(): AppComponent
    }

}

@Module
class AndroidInjectModule{

}

@Module
class AndroidSupportInjectModule{

}