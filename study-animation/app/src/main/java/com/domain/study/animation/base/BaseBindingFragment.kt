package com.domain.study.animation.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import java.lang.reflect.Method
import java.lang.reflect.ParameterizedType

abstract class BaseBindingFragment<T : ViewBinding> : Fragment() {

    lateinit var viewBinding: T

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val clazz = (javaClass.genericSuperclass as ParameterizedType).actualTypeArguments[0] as Class<*>
        val method: Method = clazz.getDeclaredMethod(
            "inflate",
            LayoutInflater::class.java,
            ViewGroup::class.java,
            Boolean::class.java
        )
        viewBinding = method.invoke(null, layoutInflater, container, false) as T
        return viewBinding.root
    }

    protected open fun initView() {}
}