package com.example.baitap12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.viewModels
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    private lateinit var btnfragment1: Button
    private lateinit var btnfragment2: Button
    private lateinit var edtTen: EditText
    private val fragmentViewModel : FragmentViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnfragment1 = findViewById(R.id.btnFragment1)
        btnfragment2 = findViewById(R.id.btnFragment2)
        edtTen = findViewById(R.id.edtText)


        btnfragment1.setOnClickListener{
            supportFragmentManager.beginTransaction().replace(R.id.fragmentLayout, Fragment1()).commit()
        }

        btnfragment2.setOnClickListener{
            fragmentViewModel.setData(edtTen.text.toString())
            supportFragmentManager.beginTransaction().replace(R.id.fragmentLayout, Fragment2()).commit()
        }
    }
}