package com.example.sunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context


//全局获取context机制
class SunnyWeatherApplication: Application() {
    //在 companion object中定义一个context变量
    companion object{
        //彩云天气的开发者平台申请的令牌值
        const val TOKEN="gdVuIb4ZbYmYdiyn"
        //由于这里获取的是application中的context，注解，让Android studio忽略上述警告提示
        @SuppressLint("StaticFieldLeak")
        lateinit var context:Context
    }
//重写Oncreate方法
    override fun onCreate() {
        super.onCreate()
        context=applicationContext
    }
}