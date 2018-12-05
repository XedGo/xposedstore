package com.xunbug.xposed.xposedstore

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

abstract class BaseFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(getLayoutResId(), null)
        init()
    }

    open fun init(){
        //初始化一些公共功能,子类也可以复写该方法，实现自己的初始化
    }

    abstract fun getLayoutResId(): Int
}