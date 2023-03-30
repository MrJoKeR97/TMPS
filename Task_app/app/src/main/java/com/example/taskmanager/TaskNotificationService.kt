package com.example.taskmanager

// 5. Dependency Inversion Principle (DIP)
class TaskNotificationService(private val notifier: Notifiable) {
    fun notifyTaskCompletion(task: Task) {
        notifier.sendNotification("Task '${task.name}' has been completed.")
    }
}