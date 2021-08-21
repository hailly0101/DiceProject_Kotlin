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

        val diceImage1 = binding.firstImage
        val diceImage2 = binding.secondImage

        binding.startBtn.setOnClickListener{

            Toast.makeText(this, "주사위 Go!!", Toast.LENGTH_LONG).show()


            Log.d("MainActivity", Random.nextInt(1, 6).toString())
            var num1 = Random.nextInt(1, 6)
            var num2 = Random.nextInt(1, 6)

            if(num1 == 1){
                diceImage1.setImageResource(R.drawable.dice_1)
            }else if(num1 == 2){
                diceImage1.setImageResource(R.drawable.dice_2)
            }else if(num1 == 3){
                diceImage1.setImageResource(R.drawable.dice_3)
            }else if(num1 == 4){
                diceImage1.setImageResource(R.drawable.dice_4)
            }else if(num1 == 5){
                diceImage1.setImageResource(R.drawable.dice_5)
            }else if(num1 == 6){
                diceImage1.setImageResource(R.drawable.dice_6)
            }


            if(num2 == 1){
                diceImage2.setImageResource(R.drawable.dice_1)
            }else if(num2 == 2){
                diceImage2.setImageResource(R.drawable.dice_2)
            }else if(num2 == 3){
                diceImage2.setImageResource(R.drawable.dice_3)
            }else if(num2 == 4){
                diceImage2.setImageResource(R.drawable.dice_4)
            }else if(num2 == 5){
                diceImage2.setImageResource(R.drawable.dice_5)
            }else if(num2 == 6){
                diceImage2.setImageResource(R.drawable.dice_6)
            }




        }
    }
}