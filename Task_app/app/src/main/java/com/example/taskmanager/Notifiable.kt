package com.example.taskmanager

// 4. Interface Segregation Principle (ISP)
interface Notifiable {
    fun sendNotification(message: String)
}

