package com.example.mvvmsampleapp.dagger.module

import androidx.lifecycle.ViewModel
import com.example.mvvmsampleapp.dagger.annotation.ViewModelKey
import com.example.mvvmsampleapp.ui.auth.AuthViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel::class)
    abstract fun bindAuthViewModel(authViewModel: AuthViewModel): ViewModel
}