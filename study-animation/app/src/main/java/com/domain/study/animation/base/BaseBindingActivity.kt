package com.domain.study.animation.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseBindingActivity<T : ViewBinding> : AppCompatActivity() {

    val viewBinding: T by lazy {
        initViewBinding()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)
    }

    /**
     * 初始化 viewBinding
     */
    abstract fun initViewBinding(): T
}