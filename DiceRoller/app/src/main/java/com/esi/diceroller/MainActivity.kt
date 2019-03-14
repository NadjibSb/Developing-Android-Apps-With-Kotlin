package com.esi.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var imgDice : ImageView
    lateinit var resultTv : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        resultTv = findViewById(R.id.tv_nbr_display)
        imgDice = findViewById(R.id.img_dice)

        var rollBtn : Button = findViewById(R.id.btn_roll)
        rollBtn.setOnClickListener{
            rollDice()
        }
    }

    private fun rollDice() {

        var i = Random().nextInt(6) +1
        resultTv.text = i.toString()

        var drawbleResource = when (i){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            6-> R.drawable.dice_6
            else -> R.drawable.dice_1
        }
        imgDice.setImageResource(drawbleResource)
    }
}
