package com.jeluchu.cloudflarepass.core.system.extensions

fun String.isCloudFlareByPassTitle(): Boolean {
    return this.contains("...")
}