package com.example.android_layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.Activity
import android.view.View
import android.widget.Toast
import com.example.android_layout.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding : ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonSave.setOnClickListener(this)


    }

    override fun onClick(view: View) {
        if (view.id == R.id.button_save) {
            val text = "O botão foi clicadooooooooooo!"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
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
