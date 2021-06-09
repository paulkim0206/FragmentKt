package com.example.fragmentkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setFragment(0)

        findViewById<Button>(R.id.btn_fragment1).setOnClickListener {
            setFragment(0)
        }

        findViewById<Button>(R.id.btn_fragment2).setOnClickListener {
            setFragment(1)
        }

        findViewById<Button>(R.id.btn_fragment3).setOnClickListener {
            setFragment(2)
        }


    }

    private fun setFragment(fragmentNum: Int) {
        val ft = supportFragmentManager.beginTransaction()
        when (fragmentNum) {
            0 -> {
                ft.replace(R.id.main_frame, Fragment1()).commit()
            }

            1 -> {
                ft.replace(R.id.main_frame, Fragment2()).commit()
            }

            2 -> {
                ft.replace(R.id.main_frame, Fragment3()).commit()
            }

        }

    }
}