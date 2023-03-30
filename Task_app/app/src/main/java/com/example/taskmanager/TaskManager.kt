package com.example.taskmanager




// 3. Liskov Substitution Principle (LSP)
class TaskManager(private val taskRepository: TaskRepository) {
    fun addTask(task: Task) {
        taskRepository.addTask(task)
    }

    fun removeTask(task: Task) {
        taskRepository.removeTask(task)
    }

    fun completeTask(task: Task) {
        task.completeTask()
    }

    fun getTasks(): List<Task> {
        return taskRepository.getTasks()
    }
}

