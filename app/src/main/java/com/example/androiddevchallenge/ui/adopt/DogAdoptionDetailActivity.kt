/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
                    }
                )
            }
        }
    }
}
