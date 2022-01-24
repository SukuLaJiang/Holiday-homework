package com.example.mvvmlib.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.mvvmlib.viewmodel.BaseViewModel

abstract class  BaseMvvmActivity<VM:BaseViewModel<*>,DB: ViewDataBinding> :AppCompatActivity() {
    protected var viewModel:VM? = null
    protected var dataBinding:DB? = null
    private var hashMap = HashMap<Int, Any>()

    abstract fun BindLayout(): Int

    abstract fun createViewModel(): VM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = createViewModel()
        dataBinding = DataBindingUtil.setContentView(this,BindLayout())
        dataBinding?.setLifecycleOwner(this)
        preproSetVar(hashMap)
        SetVar(dataBinding!!,hashMap)
        //监听汇总方法
        initonClickListener()
        //初始化view适配器数据
        initViewDate()

    }

    abstract fun initViewDate()

    abstract fun initonClickListener()

    //设置databinding
    private fun SetVar(dataBinding: DB, hashMap: java.util.HashMap<Int, Any>) {
        hashMap.forEach {
            dataBinding.setVariable(it.key,it.value) }
    }

    abstract fun preproSetVar(hashMap: Map<Int, Any>)


}