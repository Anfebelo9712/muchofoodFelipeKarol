package com.example.muchoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.muchoapp.View.ui.activities.login
import com.example.muchoapp.databinding.ActivityMainBinding


class  MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //asociación de la actividad a un layout
        //igual a setContentView(R.layout.activity_main) pero mejor
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //colocar la animación en el layout activity_main
        binding.animationView.setAnimation(R.raw.foodanimation)
        binding.animationView.playAnimation()
        //configuración de la transicion entre la animacion y la sigueinte activity
        //despues de 4 segundos
        handler=Handler(Looper.myLooper()!!)
        handler.postDelayed({
            val intent= Intent(this, login::class.java)
            startActivity(intent)
            finish()
        },4000)
    }
}

