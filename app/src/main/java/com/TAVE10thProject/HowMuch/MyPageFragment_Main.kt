package com.TAVE10thProject.HowMuch

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.TAVE10thProject.HowMuch.databinding.FragmentMainMypageBinding

class MyPageFragment_Main :Fragment(){
    lateinit var binding: FragmentMainMypageBinding
    //private lateinit var

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentMainMypageBinding.inflate(layoutInflater)
    }
}