package com.example.implisityintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import java.net.URL

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val web=findViewById<CardView>(R.id.web);
        val phone=findViewById<CardView>(R.id.phone);
        val camera=findViewById<CardView>(R.id.camera);

        web.setOnClickListener {
           val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.templepurohit.com/hanuman-stories/")
            startActivity(intent)
        }

        phone.setOnClickListener {
            val intent= Intent(Intent.ACTION_DIAL)
            intent.data= Uri.parse("tel:+1234567890")
            startActivity(intent)

        }

        camera.setOnClickListener {
            val intent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)

        }
    }
}