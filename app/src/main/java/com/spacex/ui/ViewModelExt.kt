package com.spacex.ui


import androidx.lifecycle.*
import com.spacex.R
import com.spacex.app.BaseFragment
import com.spacex.data.Resource

fun <T : Any, L : LiveData<Resource<T>,>> BaseFragment.observeResourceLoading(
    liveData: L?,
    body: (T) -> Unit
) {
    liveData?.observe(viewLifecycleOwner, Observer {
        it?.let { resource ->
            when (resource) {
                is Resource.Loading -> {
                    showLoading()
                }
                is Resource.Success -> {
                    hideLoading()
                    body.invoke(resource.data)
                }
                is Resource.Error -> {
                    hideLoading()
                    if (resource.action == null) {
                        showMessageDialog(resource.message.toString())
                    } else {
                        showMessageDialog(
                            resource.message.toString(),
                            getString(R.string.retry),
                            resource.action
                        )
                    }
                }
            }
        }
    })
}


