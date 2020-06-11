package com.example.mvvmsampleapp.dagger.module

import com.example.mvvmsampleapp.ui.auth.LoginActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(modules = [ViewModelModule::class])
    abstract fun contributesInjectLoginActivity(): LoginActivity
}