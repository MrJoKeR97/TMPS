package com.example.task_app

import com.example.taskmanager.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
                    // Crearea de obiecte și interacțiunea cu sistemul Task Manager
            val taskRepository = InMemoryTaskRepository()
            val taskManager = TaskManager(taskRepository)
            val notifier = SimpleNotifier()
            val taskNotificationService = TaskNotificationService(notifier)

            // Crearea și adăugarea de task-uri
            val task1 = SimpleTask(1, "Cumpără lapte")
            val task2 = SimpleTask(2, "Plimbă câinele")
            taskManager.addTask(task1)
            taskManager.addTask(task2)

            // Finalizarea unui task și trimiterea unei notificări
            taskManager.completeTask(task1)
            taskNotificationService.notifyTaskCompletion(task1)

        // Afișarea task-urilor
        val tasks = taskManager.getTasks()
        tasks.forEach { task ->
            val status = if (task.isCompleted) "completed" else "not completed"
            Log.d("TaskManager", "Task '${task.name}' is $status")

    }

}
}


