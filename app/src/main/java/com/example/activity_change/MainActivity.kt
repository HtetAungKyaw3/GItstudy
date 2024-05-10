package com.example.activity_change

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    lateinit var btnChange : Button;//kotline intishpe ever use lateinit var

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        btnChange = findViewById(R.id.btnChange);
        btnChange.setOnClickListener {
            //Dialog build for  use AlerDialog math
            // 1 Creat Builder
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Android kotlin")
            builder.setMessage("Do you want to changes information about anything?")
            builder.setCancelable(true)///touch to dialog outside area
            builder.setPositiveButton("Ok"){
                dialog,which->//which ->dialog interface for kotlin
                //OK Processing
                val intent = Intent(this,ScreenTwo::class.java)/// Using Explicit Intent if have class activity
                intent.putExtra("Data ","Kotlin")//data tranfra when using putExtra
                startActivity(intent)

                //When using Implicit Intent
            }
            builder.setNegativeButton("Cancel"){
                dialog,which->
                //Cancel Processing
                dialog.dismiss();

            }

            val dialog : AlertDialog = builder.create()
            dialog.show()

        }
    }
}