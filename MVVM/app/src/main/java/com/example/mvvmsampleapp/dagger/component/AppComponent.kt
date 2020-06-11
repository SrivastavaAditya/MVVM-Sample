package com.example.mvvmsampleapp.dagger.component

import android.app.Application
import com.example.mvvmsampleapp.MyApplication
import com.example.mvvmsampleapp.dagger.module.ActivityBuilderModule
import com.example.mvvmsampleapp.dagger.module.ViewModelFactoryModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(
        modules = [AndroidSupportInjectionModule::class, ActivityBuilderModule::class, ViewModelFactoryModule::class]
)
interface AppComponent: AndroidInjector<MyApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}