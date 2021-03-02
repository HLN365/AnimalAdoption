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

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.model.Dog

@Composable
fun DogDetail(dog: Dog, onAdoptClicked: OnItemClicked) {
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.TopCenter) {
        val scroll = rememberScrollState(0)
        Column(
            modifier = Modifier.background(color = Color.White),
        ) {
            Header()
            Title(dog = dog, onAdoptClicked)
            Description(dog.description, scroll = scroll)
        }
        DogImage(dog)
    }
}

@Composable
fun Header() {
    Spacer(
        modifier = Modifier
            .height(200.dp)
            .fillMaxWidth()
            .background(color = Color(0xff5500d7))
    )
}

@Composable
private fun DogImage(dog: Dog) {
    Surface(
        Modifier
            .size(width = 300.dp, height = 300.dp),
        RoundedCornerShape(50)
    ) {
        Image(
            painterResource(dog.picture),
            contentDescription = "Picture of dog: ${dog.name}",
            contentScale = ContentScale.Fit
        )
    }
}

@Composable
private fun Title(dog: Dog, onAdoptClicked: OnItemClicked) {
    Column(Modifier.padding(start = 16.dp, top = 100.dp, end = 16.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Spacer(Modifier.height(16.dp))
                Text(
                    text = dog.name,
                    style = MaterialTheme.typography.h5,
                )
                Text(
                    text = dog.breed,
                    style = MaterialTheme.typography.subtitle2,
                    fontSize = 20.sp,
                )
                Spacer(Modifier.height(4.dp))
                Text(
                    text = dog.location,
                    style = MaterialTheme.typography.h6,
                )
                Spacer(Modifier.height(8.dp))
            }
            Button(shape = RoundedCornerShape(5), onClick = { onAdoptClicked(dog) }) {
                Text(text = "Adopt")
            }
        }
        Divider()
    }
}

@Composable
fun Description(description: String, scroll: ScrollState) {
    Column(modifier = Modifier.verticalScroll(scroll)) {
        Text(
            text = description,
            style = MaterialTheme.typography.subtitle1,
            modifier = Modifier.padding(horizontal = 10.dp)
        )
    }
}
