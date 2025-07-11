package com.example.task3

import android.text.Editable
import android.text.TextWatcher
import android.widget.Button

class EnableButton(private val button: Button): TextWatcher {
    override fun beforeTextChanged(
        s: CharSequence?,
        start: Int,
        count: Int,
        after: Int
    ) {}

    override fun onTextChanged(
        s: CharSequence?,
        start: Int,
        before: Int,
        count: Int
    ) {}

    override fun afterTextChanged(s: Editable?) {
        button.isEnabled = !s.isNullOrBlank()
    }

}