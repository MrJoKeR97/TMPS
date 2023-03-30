package com.example.taskmanager

class SimpleNotifier : Notifiable {
    override fun sendNotification(message: String) {
        println("Notification: $message")
    }
}