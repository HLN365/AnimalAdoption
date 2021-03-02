package com.example.androiddevchallenge.ui.adopt

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.example.androiddevchallenge.model.Dog
import com.example.androiddevchallenge.ui.theme.MyTheme

private const val KEY_ARG_DETAILS_CITY_NAME = "KEY_ARG_DETAILS_CITY_NAME"

fun launchDetailsActivity(context: Context, dog: Dog) {
    context.startActivity(createDetailsActivityIntent(context, dog))
}

fun createDetailsActivityIntent(context: Context, dog: Dog): Intent {
    val intent = Intent(context, DogAdoptionDetailActivity::class.java)
    intent.putExtra(KEY_ARG_DETAILS_CITY_NAME, dog)
    return intent
}

class DogAdoptionDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val dog = intent.getParcelableExtra<Dog>(KEY_ARG_DETAILS_CITY_NAME)
        setContent {
            MyTheme {
                DogDetail(
                    dog = dog!!,
                    onAdoptClicked = {
                        Toast.makeText(
                            this,
                            "You have adopt ${dog.name},Thanks!",
                            Toast.LENGTH_LONG
                        ).show()
                    })
            }
        }
    }
}
