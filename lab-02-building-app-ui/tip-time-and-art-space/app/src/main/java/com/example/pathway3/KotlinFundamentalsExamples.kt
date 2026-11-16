package com.example.pathway3

/** Unit 2 Kotlin fundamentals: conditionals, nullability, classes, and lambdas. */
data class StudyTask(val title: String, val completed: Boolean)

fun completionLabel(task: StudyTask): String =
    if (task.completed) "Completed: ${task.title}" else "In progress: ${task.title}"

fun displayName(name: String?): String = name?.takeIf { it.isNotBlank() } ?: "Guest"

fun describeTasks(tasks: List<StudyTask>): List<String> =
    tasks.filter { it.completed }.map { task -> completionLabel(task) }
