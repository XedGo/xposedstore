package com.xunbug.xposed.xposedstore

/**
 * 进入APP的页面，继承自BaseActivity,需要重写getLayoutResId方法，返回一个int类型
**/

class IntoActivity: BaseActivity(){
    override fun getLayoutResId(): Int = R.layout.into_main

}