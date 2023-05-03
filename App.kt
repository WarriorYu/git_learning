package com.example.mydemo

import android.app.Application

class App : Application(){
    override fun onCreate() {
	// 我是002，我修改了不同位置的代码，没有pull就push
        super.onCreate()
	// 修改第一次
	// 修改第二次
	// 添加add命令
	// 我是git_learning,我修改后push了，但是002没有pull
    }
}
