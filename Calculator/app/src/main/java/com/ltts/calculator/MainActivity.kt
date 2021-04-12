package com.ltts.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Numbers
        Zero.setOnClickListener { appendVal("0", false) }
        One.setOnClickListener { appendVal("1", false) }
        Two.setOnClickListener { appendVal("2", false) }
        Three.setOnClickListener { appendVal("3", false) }
        Four.setOnClickListener { appendVal("4", false) }
        Five.setOnClickListener { appendVal("5", false) }
        Six.setOnClickListener { appendVal("6", false) }
        Seven.setOnClickListener { appendVal("7", false) }
        Eight.setOnClickListener { appendVal("8", false) }
        Nine.setOnClickListener { appendVal("9", false) }
        Dot.setOnClickListener { appendVal(".", false) }
        //Operators
        clear.setOnClickListener { appendVal("", true) }
        openBracket.setOnClickListener { appendVal(" ( ", false) }
        closeBracket.setOnClickListener { appendVal(" ) ", false) }
        actionDivide.setOnClickListener { appendVal(" / ", false) }
        actionMultiply.setOnClickListener { appendVal(" * ", false) }
        actionMinus.setOnClickListener { appendVal(" - ", false) }
        actionAdd.setOnClickListener { appendVal(" + ", false) }

        actionBack.setOnClickListener {
            val expression = placeholder.text.toString()
            if (expression.isNotEmpty()) {
                placeholder.text = expression.substring(0, expression.length - 1)
            }


        }

        actionEquals.setOnClickListener {
            try {
                val expression = ExpressionBuilder(placeholder.text.toString()).build()
                val result = expression.evaluate()
                val longResult = result.toLong()
                if (result == longResult.toDouble()) {
                    Toast.makeText(this, "Result", Toast.LENGTH_SHORT).show()
                    answer.text = longResult.toString()
                } else
                    answer.text = result.toString()

            } catch (e: Exception) {
                Toast.makeText(this, e.message, Toast.LENGTH_SHORT).show();

                Log.d("EXCEPTION", "Message: ${e.message}")
            }

        }


    }

    fun appendVal(string: String, isClear: Boolean) {
        if (isClear) {
            placeholder.text = ""
            answer.text = ""
        } else {
            placeholder.append(string)
        }
    }

}