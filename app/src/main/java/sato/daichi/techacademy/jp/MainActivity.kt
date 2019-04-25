package sato.daichi.techacademy.jp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dog = Dog("ポチ", 3)
        val human = Human("太郎", 20, "Kotlin")

        dog.move()
        human.say()
        human.think()
    }
}
