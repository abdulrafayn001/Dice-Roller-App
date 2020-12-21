package com.example.diceroller

class Dice(var numberOfSides:Int) {
    fun roll():Int{
        return (1..numberOfSides).random()
    }
}