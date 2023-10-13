package com.example.android_layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.Activity
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.android_layout.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding : ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        binding.buttonSave.setOnClickListener(this)
        binding.buttonAdicionar.setOnClickListener(this)


    }

    override fun onClick(view: View) {
//        if (view.id == R.id.button_save) {
//            val text = "O botão foi clicadooooooooooo!"
//            val duration = Toast.LENGTH_SHORT
//            val toast = Toast.makeText(applicationContext, text, duration)
//            toast.show()
//        }

//        if (view.id == R.id.button_adicionar) {
//            val editText = findViewById<EditText>(R.id.editText)
//            val userInput = editText.text.toString()
//            binding.buttonAdicionar.text = userInput
//
//       }

        if (view.id == R.id.button_adicionar) {
            val editText = findViewById<EditText>(R.id.editText_one)
            val userInput = editText.text.toString()

            // Use data binding to set the text of the TextView
            binding.textHello.text = "Olá, $userInput"
        }



    }




}

//    override fun onClick(view: View) {
////        if (view.id == R.id.button_login{
////            // Chama o método que trata esse botão
////        } else if (view.id == R.id.button_calculate) {
////            // Chama o método que trata esse botão
////        }
//        if (view.id == R.id.button_save ){
//                // Chama o método que trata esse botão
//        }
//    }
