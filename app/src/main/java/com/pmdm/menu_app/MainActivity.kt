package com.pmdm.menu_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button
    private lateinit var btn4: Button
    private lateinit var btn5: Button
    private lateinit var tvText: TextView
    private var visible:Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initComponents()
        initListeners()
    }

    private fun initComponents() {
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        tvText = findViewById(R.id.tvText)
    }

    private fun initListeners() {
        btn1.setOnClickListener {
            var intentOA = Intent(this,OtherActivity::class.java)
            startActivity(intentOA)
        }

        btn2.setOnClickListener {
            Toast.makeText(this,"Le has dado al botón 2",Toast.LENGTH_LONG).show()
        }

        btn3.setOnClickListener {
            Snackbar.make(btn3,"Le has dado al botón 3",Snackbar.LENGTH_SHORT).show()
        }

        btn4.setOnClickListener {
            Snackbar.make(btn4,"Cerrar aplicación",Snackbar.LENGTH_SHORT).setAction("CLOSE"){ finishAffinity()}.show()
        }

        btn5.setOnClickListener {
            visible = !visible

            tvText.visibility = if(visible) View.VISIBLE else View.GONE
        }
    }
}