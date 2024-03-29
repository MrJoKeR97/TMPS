package com.example.taskmanager

class SimpleTask(override val id: Int, override val name: String) : Task {
    override var isCompleted: Boolean = false
        private set

    override fun completeTask() {
        isCompleted = true
    }
}
