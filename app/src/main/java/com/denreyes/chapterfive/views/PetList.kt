package com.denreyes.chapterfive.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.denreyes.chapterfive.PetsViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.denreyes.chapterfive.ui.theme.ChapterFiveTheme
import org.koin.androidx.compose.koinViewModel

@Composable
fun PetList(modifier: Modifier) {
    val petsViewModel: PetsViewModel = koinViewModel()
    LazyColumn(
        modifier = modifier
    ) {
        items(petsViewModel.getPets()) { pet ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Name ${pet.name}")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PetListPreview() {
    ChapterFiveTheme {
        PetList(modifier = Modifier)
    }
}