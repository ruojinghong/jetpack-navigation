package com.sxy.jetpack_navigation.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.sxy.jetpack_navigation.R
import com.sxy.jetpack_navigation.databinding.DetailFragmentBinding
import com.sxy.jetpack_navigation.databinding.FragmentHomeBinding
import me.hgj.jetpackmvvm.callback.livedata.StringLiveData

class DetailFragment : Fragment() {
    companion object {
        fun newInstance() = DetailFragment()
    }
    lateinit var mDatabind: DetailFragmentBinding

    private lateinit var viewModel: DetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        mDatabind =  DataBindingUtil.inflate(inflater,R.layout.detail_fragment,container,false)
        mDatabind.lifecycleOwner = this
        return mDatabind.root
    }



    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DetailViewModel::class.java)
        mDatabind.vm = viewModel
        viewModel.info.value= "mac pro"
        viewModel.price.value = "19888"
    }

}