package br.com.marcelomonier.firstprogramkotlin

import android.content.Intent
import android.content.pm.ActivityInfo
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      val btn = findViewById<Button>(R.id.button) as Button
        val btn2 = findViewById<Button>(R.id.button2) as Button

        //Ação do botão 1
        btn.setOnClickListener {


            Toast.makeText(this@MainActivity,
                    "Apertou o botão", Toast.LENGTH_LONG).show()

        }

        //Ação do botão 2
        btn2.setOnClickListener {


            Toast.makeText(this@MainActivity,
                    "Outra mensagem", Toast.LENGTH_LONG).show()

        }


        }


    }




