package com.spacex.util

import android.content.Intent
import android.net.Uri
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment

fun Fragment.openWebsite(link:String) {
    startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(link)))
}