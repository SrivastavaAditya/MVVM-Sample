package com.example.mvvmsampleapp.ui.auth

interface AuthListener {

    fun onStarted()

    fun onSuccess()

    fun onFailure(message: String)
}