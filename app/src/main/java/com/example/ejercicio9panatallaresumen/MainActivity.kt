package com.example.ejercicio9panatallaresumen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio9panatallaresumen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    var clase :Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imageView.setImageResource(R.drawable.seleccion)
        binding.button.setOnClickListener{
            binding.imageView.setImageResource(R.drawable.berserker)
            clase = R.drawable.berserker
        }
        binding.button2.setOnClickListener(){
            binding.imageView.setImageResource(R.drawable.mago)
            clase = R.drawable.mago
        }
        binding.button3.setOnClickListener(){
            binding.imageView.setImageResource(R.drawable.guerrero)
            clase = R.drawable.guerrero
        }
        binding.button4.setOnClickListener(){
            binding.imageView.setImageResource(R.drawable.ladron)
            clase = R.drawable.ladron
        }
        binding.button5.setOnClickListener(){
            if (clase != 0 ){
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("clase",clase )
            startActivity(intent)
            }

        }
    }
}