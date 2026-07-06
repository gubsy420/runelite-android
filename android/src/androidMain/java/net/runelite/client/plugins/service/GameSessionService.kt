package net.runelite.client.plugins.service

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.Service
import android.content.Intent
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat
import net.runelite.mp.MainActivity.Companion.instance
import net.runelite.mp.R

class GameSessionService : Service() {

    companion object {
        private const val CHANNEL_ID = "runelite_session"
        private const val NOTIFICATION_ID = 1001

        fun start() {
            val intent = Intent(instance, GameSessionService::class.java)
            ContextCompat.startForegroundService(instance, intent)
        }

        fun stop() {
            instance.stopService(
                Intent(instance, GameSessionService::class.java)
            )
        }
    }

    override fun onCreate() {
        super.onCreate()
        createNotificationChannel()

        val notification = NotificationCompat.Builder(this, CHANNEL_ID)
            .setContentTitle("RuneLite")
            .setContentText("logged in")
            .setSmallIcon(R.drawable.runelite_logo)
            .setOngoing(true)
            .build()

        startForeground(NOTIFICATION_ID, notification)
        println("Service created")
    }

    override fun onStartCommand(
        intent: Intent?,
        flags: Int,
        startId: Int
    ): Int {
        return START_STICKY
    }

    override fun onBind(intent: Intent?) = null

    private fun createNotificationChannel() {
        val channel = NotificationChannel(
            CHANNEL_ID,
            "RuneLite Session",
            NotificationManager.IMPORTANCE_LOW
        )

        getSystemService(NotificationManager::class.java)
            .createNotificationChannel(channel)
    }
}