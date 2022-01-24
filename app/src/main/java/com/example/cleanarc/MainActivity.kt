package com.example.cleanarc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "hello boy", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "hello boy 2", Toast.LENGTH_SHORT).show()
    }
}