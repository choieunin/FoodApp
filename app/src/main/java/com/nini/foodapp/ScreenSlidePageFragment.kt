package com.nini.foodapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class ScreenSlidePageFragment : Fragment() {  //onCreateView() 메서드에서 레이아웃을 반환하는 fragment 클래스를 만든다.

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.layout_main, container, false)
}