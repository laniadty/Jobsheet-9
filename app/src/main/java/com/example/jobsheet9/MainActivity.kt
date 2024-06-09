package com.example.jobsheet9

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnMahasiswa: View = findViewById(R.id.btnMahasiswa)
        val btnKampus: View = findViewById(R.id.btnKampus)

        btnMahasiswa.setOnClickListener {
            val intent = Intent(this, SecondActivity2::class.java)
            startActivity(intent)
        }

        btnKampus.setOnClickListener {
            val intent = Intent(this, kampusactivity::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}