package com.example.holidayhomework.viewmodel

import androidx.lifecycle.LifecycleObserver
import com.example.holidayhomework.model.LoginModel
import com.example.mvvmlib.viewmodel.BaseViewModel

class LoginViewModel(lifecycleObserver: LifecycleObserver) :BaseViewModel<LoginModel>() {
    override fun createModel(): LoginModel  = LoginModel()

}