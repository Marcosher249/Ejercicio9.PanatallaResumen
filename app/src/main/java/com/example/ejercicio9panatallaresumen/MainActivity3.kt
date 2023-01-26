package com.example.ejercicio9panatallaresumen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio9panatallaresumen.databinding.ActivityMain2Binding
import com.example.ejercicio9panatallaresumen.databinding.ActivityMain3Binding
import com.example.ejercicio9panatallaresumen.databinding.ActivityMainBinding

class MainActivity3 : AppCompatActivity() {
    lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val bundle = intent.extras
        val clase = bundle?.getInt("clase")
        val especie = bundle?.getInt("especie")
        binding.imageView3.setImageResource(clase!!)
        binding.imageView4.setImageResource(especie!!)

    }
}