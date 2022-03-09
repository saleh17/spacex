package com.spacex.util

import android.app.Activity
import android.content.Intent
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import com.spacex.R

fun Fragment.share(message:String) {
    val shareIntent = Intent()
    shareIntent.action = Intent.ACTION_SEND
    shareIntent.type="text/plain"
    shareIntent.putExtra(Intent.EXTRA_TEXT, message);
    startActivity(Intent.createChooser(shareIntent,getString(R.string.send_to)))
}