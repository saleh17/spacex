package com.spacex.app

import android.app.ProgressDialog
import android.content.Context
import android.view.View
import android.widget.FrameLayout
import android.widget.ProgressBar
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.spacex.R


abstract class BaseFragment: Fragment() {

    protected var progressDialog: ProgressDialog? = null

    private var loadingLayout: ProgressBar? = null

    fun showLoading(){
        if (progressDialog==null) {
            progressDialog = ProgressDialog(context)
            progressDialog?.setMessage(getString(R.string.loading))
            progressDialog?.setCancelable(false)
            progressDialog?.show()
        }else
        {
            progressDialog?.show()
        }

    }

    fun hideLoading(){
        progressDialog?.dismiss()
    }

    fun showMessageDialog(
        message: String,
        buttonText: String = getString(R.string.ok),
        callback: (() -> Unit)? = null
    ) {
            AlertDialog.Builder(requireActivity())
                .setMessage(message)
                .setPositiveButton(buttonText) { _, _ -> callback?.invoke() }
                .show()
    }

}