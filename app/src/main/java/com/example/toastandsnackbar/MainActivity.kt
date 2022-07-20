package com.example.toastandsnackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.toastandsnackbar.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnToast.setOnClickListener {
            Toast.makeText(this, "This is Toast", Toast.LENGTH_SHORT).show()
        }
        binding.btnSnackbar.setOnClickListener {
            val snackbar = Snackbar.make(binding.root,"This is Snackbar",Snackbar.LENGTH_INDEFINITE)
            snackbar.setAction("Dismiss"){
                Toast.makeText(this, "Dismiss Clicked", Toast.LENGTH_SHORT).show()
                Log.d("MainActivity","Dismiss")
            }.show()
            // Untuk mempermudah kita tampung terlebih dahulu menggunakan Variable
        }
    }
}