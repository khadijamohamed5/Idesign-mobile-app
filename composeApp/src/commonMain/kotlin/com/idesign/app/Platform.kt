package com.idesign.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform