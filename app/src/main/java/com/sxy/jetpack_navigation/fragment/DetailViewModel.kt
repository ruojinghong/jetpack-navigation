package com.sxy.jetpack_navigation.fragment

import androidx.lifecycle.ViewModel
import me.hgj.jetpackmvvm.callback.livedata.FloatLiveData
import me.hgj.jetpackmvvm.callback.livedata.StringLiveData

class DetailViewModel : ViewModel() {

    var info  =  StringLiveData()
    var price = StringLiveData()
}