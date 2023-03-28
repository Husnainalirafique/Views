package com.example.views

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.ButtonBarLayout
import com.example.views.databinding.ActivityEditTextBinding

class EditText : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    private lateinit var binding: ActivityEditTextBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setting view binding
        binding = ActivityEditTextBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        //Done
        val editText = binding.et1
        val button = binding.bt
        val etEmail = binding.etEmail
        val etPassword = binding.etPassword
        val buttonLogin = binding.loginButton
        supportActionBar?.hide()
        //adding the text watcher
        val textWatcher = object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                val input = etEmail.text.isNotEmpty() && etPassword.text.isNotEmpty()
                buttonLogin.isEnabled = input
            }

        }
        etEmail.addTextChangedListener(textWatcher)
        etPassword.addTextChangedListener(textWatcher)
        button.setOnClickListener {
            if (editText.text.toString().isEmpty()) {
                Toast.makeText(this, "empty", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, editText.text.toString(), Toast.LENGTH_SHORT).show()
            }
        }

    }
}