package com.henrach10.skillswap
app/src/main/java/com/henrach10/skillswap/MainActivity.kt
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.Button
class MainActivity : AppCompatActivity() {
   // Initialize views
    private lateinit var welcomeTextView: TextView
    private lateinit var exchangeButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Set the layout resource

        // Link views to the layout
        welcomeTextView = findViewById(R.id.welcomeTextView)
        exchangeButton = findViewById(R.id.exchangeButton)

        // Set a welcome message
        welcomeTextView.text = "Welcome to Skillswap!"

        // Set a click listener for the button
        exchangeButton.setOnClickListener {
            // Handle the exchange action here
            startSkillExchange()
        }
    }
activity_main.xml
    // Function to handle skill exchange action
    private fun startSkillExchange() {
        // Logic to start skill exchange process
    }
}
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp">

    <TextView
        android:id="@+id/welcomeTextView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="24sp"
        android:textColor="#000000" />

    <Button
        android:id="@+id/exchangeButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Start Skill Exchange" />
</LinearLayout>
