package com.droidplusplus.toasterlibrary

import android.content.Context
import android.widget.Toast

object ToasterMessage {
    fun toast(context: Context, message: String?) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}