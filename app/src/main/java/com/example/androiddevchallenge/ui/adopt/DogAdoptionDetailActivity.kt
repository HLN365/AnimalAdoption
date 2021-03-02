package com.example.androiddevchallenge.ui.adopt

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.example.androiddevchallenge.ui.theme.MyTheme

class DogAdoptionDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                DogDetail()
            }
        }
    }
}
