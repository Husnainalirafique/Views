package com.example.views.textView

import android.content.ClipData
import android.content.ClipboardManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.views.R

class TextView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_view2)
        supportActionBar?.hide()
        val pasteTxt = findViewById<android.widget.TextView>(R.id.txtShow)
        val btnPaste = findViewById<Button>(R.id.btnShow)

        val copyTxt = findViewById<EditText>(R.id.txtCopy)
        val copyBtn = findViewById<Button>(R.id.btnCopy)

        val clipboardManager = getSystemService(CLIPBOARD_SERVICE) as ClipboardManager
        var clipData: ClipData

        copyBtn.setOnClickListener {
            val txtCopy = copyTxt.text.toString()

            clipData = ClipData.newPlainText("text", txtCopy)

            clipboardManager.setPrimaryClip(clipData)

            Toast.makeText(this, "Copied", Toast.LENGTH_SHORT).show()
        }
        btnPaste.setOnClickListener {

            // Storing the clip data in a variable
            val pData = clipboardManager.primaryClip

            // Retrieving the items
            val item = pData?.getItemAt(0)

            // item is converted to string and stored in a variable
            val txtPaste = item?.text.toString()

            // Textview is set as txtPaste string
            pasteTxt.text = txtPaste
            // Toast for user reference
            Toast.makeText(applicationContext, "Pasted from Clipboard", Toast.LENGTH_SHORT).show()
        }
    }


}