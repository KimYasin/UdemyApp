package com.kimyasin.udemyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class splashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val background=object:Thread(){
            override fun run(){
                try{
                    sleep(3000)
                    val intent=Intent(baseContext, MainActivity::class.java)
                    startActivity(intent)
                }catch(e: Exception){
                    e.printStackTrace()
                }
            }
        }
        background.start()
    }
}
