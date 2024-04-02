package com.example.mymew2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val historicalFigures = mapOf(
        95 to "Nelson Mandela",
        67 to "George Washington",
        39 to "Martin Luther King Jr",
        32 to "Alexander the Great",
        52 to "William Shakespeare",
        56 to "Abraham Lincoln",
        76 to "Albert Einstein",
        73 to "Charles Darwin",
        78 to "Mahatma Gandhi",
        33 to "JESUS CHRIST",
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button2 = findViewById<Button>(R.id.button2)
        val editTextText2 = findViewById<EditText>(R.id.editTextText2)
        val textView = findViewById<TextView>(R.id.textView)
        val button1 = findViewById<Button>(R.id.button1)

        button2.setOnClickListener {
                editTextText2.text.clear()

                button1.setOnClickListener {
                   val age = editTextText2.text.toString().toIntOrNull()
                    age?.let {
                        val figure = historicalFigures[age]
                        if (figure != null ) {
                            textView.text = "You are $age years old, which is the same age as $figure when he died."
                        }else {
                            textView.text = "There is no history figure who died at the age of $age in our records."

                        }
                        }?: run {
                            textView.text = "Please enter age ranging from 30 to 100 "
                    }
                }
            }
        }
    }

