package com.jeluchu.cloudflarepass.core.system.extensions

import android.webkit.WebView

fun WebView.evaluateJavascript(script: String) {
    evaluateJavascript(script, null)
}