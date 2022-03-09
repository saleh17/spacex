package com.spacex.app

import androidx.viewbinding.ViewBinding

abstract class BaseVBFragment<VB : ViewBinding>: BaseFragment() {

    var binding: VB? = null
    fun requireBinding(): VB = requireNotNull(binding) { "View Binding required and was not found." }


}