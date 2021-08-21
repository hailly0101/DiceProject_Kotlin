package com.basic.diceapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.basic.diceapplication.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.startBtn.setOnClickListener{

            Toast.makeText(this, "주사위 Go!!", Toast.LENGTH_LONG).show()


//            Log.d("MainActivity", Random.nextInt(1, 6).toString())
//            Random.nextInt(1, 6)
//            Random.nextInt(1, 6)


        }
    }
}