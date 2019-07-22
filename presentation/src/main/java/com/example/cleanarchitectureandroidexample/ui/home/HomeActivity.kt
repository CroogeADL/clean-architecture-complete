package com.example.cleanarchitectureandroidexample.ui.home

import androidx.fragment.app.Fragment
import com.example.cleanarchitectureandroidexample.R
import com.example.cleanarchitectureandroidexample.common.BaseActivity

class HomeActivity : BaseActivity() {

    override val contentLayoutId: Int
        get() = R.layout.layout_container

    override val fragmentLayout: Int?
        get() = R.id.fl_content

    override val fragmentForLayout: Fragment?
        get() = HomeFragment.newInstance()
}
