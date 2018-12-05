package com.xunbug.xposed.xposedstore

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity

/**
 * 所有ACTIVITY的基类，这样干是因为以后好扩展
 * 比如说A,B,C都要加个摇一摇功能，那都要重写一个方法
 */


abstract class BaseActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutResId())
        init()

    }

    open fun init() {
        //初始化一些公共功能，比如摇一摇
    }


    //子类必须实现这样一个方法，返回布局ID
    abstract fun getLayoutResId(): Int


}