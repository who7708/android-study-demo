package com.domain.study.animation.base

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import java.lang.reflect.Method
import java.lang.reflect.ParameterizedType

abstract class BaseBindingActivity<T : ViewBinding> : AppCompatActivity() {

    // 初始化 viewBinding ，使用懒加载方式
    val viewBinding: T by lazy {
        // 1. 手动注入 viewBinding
        // initViewBinding()
        // 2. 反射注入 viewBinding
        val clazz = (javaClass.genericSuperclass as ParameterizedType).actualTypeArguments[0] as Class<*>
        val method: Method = clazz.getDeclaredMethod("inflate", LayoutInflater::class.java)
        method.invoke(null, layoutInflater) as T
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)
        initView()
    }

    protected open fun initView() {}

    fun start(context: Context, clazz: Class<*>?) {
        val starter = Intent(context, clazz)
        startActivity(starter)
    }

    // /**
    //  * 初始化 viewBinding
    //  */
    // abstract fun initViewBinding(): T
}