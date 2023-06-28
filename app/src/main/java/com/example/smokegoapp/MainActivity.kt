package com.example.smokegoapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Button
import kotlin.math.PI
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ent1 :EditText = findViewById(R.id.enter1)
        val ent2 :EditText = findViewById(R.id.enter2)
        val ent3 :EditText = findViewById(R.id.enter3)

        val ou1 :TextView = findViewById(R.id.out1)
        val ou2 :TextView = findViewById(R.id.out2)
        val ou3 :TextView = findViewById(R.id.out3)
        val ou4 :TextView = findViewById(R.id.out4)

        val button : Button = findViewById(R.id.action)

        button.setOnClickListener {

            val in1 : String = ent1.text.toString()
            val in2 : String = ent2.text.toString()
            val in3 : String = ent3.text.toString()

            val h : Float = in1.toFloat()
            val b : Float = in2.toFloat()
            val l : Float = in3.toFloat()

            val sh : Float = b * l
            val vh : Float = sh * h
            val q : Float = 3 * vh
            val f : Float = q / 5400
            val nd : Float = (sh / 50) + 1
            val n : Int  = nd.toInt()
            val st : Float = f / n
            val p : Float = PI.toFloat()
            val d2 : Float = 4 * st / p
            val dt : Float = sqrt(d2)

            val rst1 : String = sh.toString()
            val rst2 : String = vh.toString()
            val rst3 : String = n.toString()
            val rst4 : String = dt.toString()

            ou1.text = rst1
            ou2.text = rst2
            ou3.text = rst3
            ou4.text = rst4

        }
    }
}