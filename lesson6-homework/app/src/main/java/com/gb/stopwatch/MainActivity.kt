package com.gb.stopwatch

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.collect

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.text_time)
        val model=ViewModelProvider(this).get(MainViewModel::class.java)
        model.liveData.observe(this, { data->textView.text=data} )

        findViewById<Button>(R.id.button_start).setOnClickListener {
           model.start()
        }
        findViewById<Button>(R.id.button_pause).setOnClickListener {
            model.pause()
        }
        findViewById<Button>(R.id.button_stop).setOnClickListener {
            model.stop()
        }

    }
}
