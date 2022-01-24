package com.example.mvvmlib.viewmodel

import androidx.lifecycle.*
import com.example.mvvmlib.model.IModel

 abstract class BaseViewModel<M : IModel?> : ViewModel() {
    protected var model:M
    protected abstract fun createModel(): M
    init{
        model = createModel()

    }


 }