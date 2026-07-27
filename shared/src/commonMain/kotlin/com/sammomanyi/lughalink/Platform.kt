package com.sammomanyi.lughalink

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform