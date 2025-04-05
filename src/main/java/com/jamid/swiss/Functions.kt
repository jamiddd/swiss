package com.jamid.swiss

fun isPrime(number: Int): Boolean {
    if (number <= 1) return false
    for (i in 2..kotlin.math.sqrt(number.toDouble()).toInt()) {
        if (number % i == 0) return false
    }
    return true
}