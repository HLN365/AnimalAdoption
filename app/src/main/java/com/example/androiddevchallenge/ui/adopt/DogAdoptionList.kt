package com.example.androiddevchallenge.ui.adopt

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.model.Dog
import com.example.androiddevchallenge.model.dogList
import dev.chrisbanes.accompanist.coil.CoilImage

typealias OnItemClicked = (Dog) -> Unit

@Composable
fun DogAdoptionList(
    modifier: Modifier = Modifier,
    dogList: List<Dog>,
    onItemClicked: OnItemClicked
) {
    Surface(modifier = modifier.fillMaxSize(), color = Color.White) {
        LazyColumn {
            items(dogList) { dog ->
                DogItem(
                    modifier = Modifier.fillParentMaxWidth(),
                    dog = dog,
                    onItemClicked = onItemClicked
                )
            }
        }
    }
}


@Composable
private fun DogItem(
    modifier: Modifier = Modifier,
    dog: Dog,
    onItemClicked: OnItemClicked,
) {
    Surface(
        modifier = modifier
            .background(Color.White, shape = RoundedCornerShape(5.dp))
            .padding(top = 12.dp, bottom = 12.dp)
    ) {
        Column {
            Row(
                modifier = modifier
                    .clickable { onItemClicked(dog) }
                    .padding(start = 10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Surface(Modifier.size(width = 100.dp, height = 100.dp), RoundedCornerShape(4.dp)) {
                    CoilImage(
                        data = dog.imageUrl,
                        fadeIn = true,
                        contentScale = ContentScale.Crop,
                        contentDescription = null,
                    )
                }
                Spacer(Modifier.width(24.dp))
                Column {
                    Text(
                        text = dog.name,
                        style = MaterialTheme.typography.h6
                    )
                    Spacer(Modifier.height(8.dp))
                    Text(
                        text = dog.breed,
                        style = MaterialTheme.typography.h6
                    )
                    Spacer(Modifier.height(8.dp))
                    Text(
                        text = dog.location,
                        style = MaterialTheme.typography.h6
                    )
                }
            }
            Spacer(Modifier.height(8.dp))
            Divider(color = Color.LightGray)
        }
    }
}

@Preview
@Composable
fun DogItemPreview() {
    MaterialTheme() {
        DogAdoptionList(dogList = dogList, onItemClicked = {})
    }
}