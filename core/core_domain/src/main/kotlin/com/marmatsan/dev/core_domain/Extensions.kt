package com.marmatsan.dev.core_domain

val String.Companion.Empty
    inline get() = ""

fun <T> MutableList<T>.toggle(element: T) {
    if (contains(element)) {
        remove(element)
    } else {
        add(element)
    }
}

val Int.length: Int
    inline get() = this.toString().length