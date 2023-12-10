package com.example.massive_lesung

import android.os.Bundle
import android.os.Handler
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity

class SiswaCompleteLes : AppCompatActivity() {
    private lateinit var progressBar: ProgressBar
    private var progressStatus = 80

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_siswa_complete_les)

        progressBar = findViewById(R.id.progressBar)

        // Example: Updating the progress bar in a background thread
        val handler = Handler()
        Thread {
            while (progressStatus < 100) {
                progressStatus += 5

                // Update the progress bar on the UI thread
                handler.post {
                    progressBar.progress = progressStatus
                }

                try {
                    // Simulate a time-consuming task
                    Thread.sleep(100)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
            }
        }.start()
//
//        val progressBar = findViewById(R.id.progressBar)
//        // Set visibility as needed
//        progressBar.visibility = View.VISIBLE
//        // progressBar.visibility = View.GONE // to hide it
    }
}