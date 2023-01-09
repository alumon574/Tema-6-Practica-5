package com.example.tema6practica5

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.view.animation.LinearInterpolator
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonAnimador = findViewById<Button>(R.id.BotonAnimar)
        val textoAlpha = findViewById<TextView>(R.id.Alpha)
        val botonEscalar = findViewById<Button>(R.id.BotonEscalar)

        val animacionEscalar = ObjectAnimator.ofFloat(botonEscalar,"textSize",25.0f,50.0f)
        animacionEscalar.duration=200
        animacionEscalar.interpolator=LinearInterpolator()



        botonAnimador.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                val animacionAlpha : Animation =
                    AnimationUtils.loadAnimation(this@MainActivity, R.anim.alpha)
                textoAlpha.startAnimation(animacionAlpha)
                animacionEscalar.start()
            }
        })
        }
    }
