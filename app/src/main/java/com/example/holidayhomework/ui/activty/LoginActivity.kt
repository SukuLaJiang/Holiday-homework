package com.example.holidayhomework.ui.activty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import com.example.holidayhomework.R
import com.example.holidayhomework.databinding.LoginDataBinding
import com.example.holidayhomework.viewmodel.LoginViewModel
import com.example.mvvmlib.view.BaseMvvmActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseMvvmActivity<LoginViewModel,LoginDataBinding>(),LifecycleObserver{
    override fun BindLayout(): Int  = R.layout.activity_login

    override fun createViewModel(): LoginViewModel  = LoginViewModel(this)

    override fun preproSetVar(hashMap: Map<Int, Any>) {
        //下一步按钮监听
      go_next.setOnClickListener {

      }

    }

    override fun initonClickListener() {

    }

    override fun initViewDate() {


        select_the_language.adapter =  ArrayAdapter(this,R.layout.arrayadater_item, arrayOf("简体中文","English"))
        number_home.adapter = ArrayAdapter(this,R.layout.arrayadater_item, arrayOf("+86","+87"))
    }

}