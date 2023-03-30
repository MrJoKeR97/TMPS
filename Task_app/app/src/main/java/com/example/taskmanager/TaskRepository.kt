package com.example.taskmanager

// 2. Open/Closed Principle (OCP)
interface TaskRepository {
    fun addTask(task: Task)
    fun removeTask(task: Task)
    fun getTasks(): List<Task>
}

