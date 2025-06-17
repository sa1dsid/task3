package com.example.task3

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.task3.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        val textView = binding.textView
        val button = binding.button
        val textInputEditText = binding.textInputEditText

        val textWatcher = EnableButton(button)

        textInputEditText.addTextChangedListener(textWatcher)

        button.setOnClickListener{
            textView.text = textInputEditText.text
            textInputEditText.setText("")        }
        }
    }
