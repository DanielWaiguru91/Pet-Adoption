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
package com.example.androiddevchallenge.ui

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.example.androiddevchallenge.model.PetModel
import com.example.androiddevchallenge.repository.DataStore
import com.example.androiddevchallenge.ui.components.DisplayPets

@ExperimentalFoundationApi
@Composable
fun PetListScreen(onPetItemClicked: (PetModel) -> Unit) {
    Column {
        androidx.compose.material.TopAppBar(
            title = {
                Text(text = "Pet Adopter")
            }
        )
        Log.d("Pets", DataStore.allPets.toString())
        DisplayPets(DataStore.allPets) {
            onPetItemClicked(it)
        }
    }
}
