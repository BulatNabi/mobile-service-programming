package com.example.unit1

/** Small Kotlin Playground exercises from Unit 1. */
fun main() {
    val name = "Bulat"
    val course = "Android Basics with Compose"
    println("Hello, $name!")
    println("I'm learning $course.")

    println("Two plus three is ${addNumbers(2, 3)}.")
    println(describeStudySession("Jetpack Compose", 45))
}

fun addNumbers(first: Int, second: Int): Int = first + second

fun describeStudySession(topic: String, minutes: Int): String =
    "I studied $topic for $minutes minutes."
