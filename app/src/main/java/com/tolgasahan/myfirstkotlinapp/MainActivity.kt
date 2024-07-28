package com.tolgasahan.myfirstkotlinapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.annotation.ContentView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.tolgasahan.myfirstkotlinapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // TEST COMMIT
        /*
        val image = findViewById<ImageView>(R.id.imageView)

        val myTextView = findViewById<TextView>(R.id.textView)
        myTextView.text = "Sa"

        image.setImageResource(R.drawable.istanbul2)

        binding.button.setOnClickListener{
            binding.textView.text = "Deneme"
        };
        */


    }

    fun kaydet(view: View){
        binding.textView.text = "deneme"
    }
}