package com.example.cleanarchitectureandroidexample.ui.home

import com.example.cleanarchitectureandroidexample.R
import com.example.cleanarchitectureandroidexample.common.BaseFragment
import com.example.cleanarchitectureandroidexample.databinding.FragmentHomeBinding
import org.koin.android.viewmodel.ext.android.viewModel

class HomeFragment : BaseFragment<FragmentHomeBinding>(), HomeActionListener {

    private val viewModel: HomeViewModel by viewModel()

    override val contentLayoutId: Int
        get() = R.layout.fragment_home

    companion object {
        fun newInstance() = HomeFragment()
    }

    override fun setupBinding(binding: FragmentHomeBinding) {
        binding.apply {
            listener = this@HomeFragment
            viewModel = this@HomeFragment.viewModel
        }
    }

    override fun setupViewModel() = viewModel.start()

    override fun onNextClicked() = viewModel.onNextClicked()
}