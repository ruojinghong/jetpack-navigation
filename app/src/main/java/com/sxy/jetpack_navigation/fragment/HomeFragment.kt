package com.sxy.jetpack_navigation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

import com.sxy.jetpack_navigation.R
import com.sxy.jetpack_navigation.databinding.FragmentHomeBinding

/**
 * @author: sxy
 * @date: 2021/2/4
 * @description:
 */
class HomeFragment : Fragment() {
    lateinit var mDatabind: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mDatabind = DataBindingUtil.inflate(inflater,
            R.layout.fragment_home, container, false)
        mDatabind.lifecycleOwner = this
        return mDatabind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //实例化navcontroller 三种方式
//        Fragment.findNavController()
//        View.findNavController()
//        Activity.findNavController(viewId: Int)

        mDatabind.click = ProxyClick()
    }

    inner class ProxyClick{



            fun godetail(){

               findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToDetailFragment("mac pro","198"))
            }

            fun gologin(){
                findNavController().navigate(R.id.action_homeFragment_to_loginFragment)
            }

    }
}