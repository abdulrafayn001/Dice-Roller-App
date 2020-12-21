package com.example.diceroller

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var resultImageView:ImageView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton:Button=findViewById(R.id.roll_btn)
        resultImageView=findViewById(R.id.dice_iv)

        rollButton.setOnClickListener{
            Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
            rollDice()
        }

    }

    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()
        // Update the screen with the dice roll
        when (diceRoll)
        {
            1 -> resultImageView.setImageResource(R.drawable.one)
            2 -> resultImageView.setImageResource(R.drawable.two)
            3 -> resultImageView.setImageResource(R.drawable.three)
            4 -> resultImageView.setImageResource(R.drawable.four)
            5 -> resultImageView.setImageResource(R.drawable.five)
            6 -> resultImageView.setImageResource(R.drawable.six)

        }
    }
}