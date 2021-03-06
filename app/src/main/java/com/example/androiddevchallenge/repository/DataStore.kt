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
package com.example.androiddevchallenge.repository

import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.model.PetModel

object DataStore {
    val allPets = listOf(
        PetModel(
            0, "Teddy", "Male", "German Shepherd",
            20.4, 1, R.drawable.pet1, "Nakuru, Kenya"
        ),
        PetModel(
            1, "Ollie", "Female", "Bulldog",
            18.7, 1, R.drawable.pet2, "Nairobi, Kenya"
        ),
        PetModel(
            2, "Butterfingers", "Male", "Golden Retriever",
            6.7, 4, R.drawable.pet3, "Nairobi, Kenya"
        ),
        PetModel(
            3, "Snugglekins", "Female", "Poodie",
            9.9, 2, R.drawable.pe4, "Western, Kenya"
        ),
        PetModel(
            4, "Beau", "Female", "French Bulldog",
            11.9, 1, R.drawable.pet5, "Eldoret, Kenya"
        ),
        PetModel(
            5, "Ollie", "Female", "Pug",
            13.1, 3, R.drawable.pet6, "Nairobi, Kenya"
        ),
    )
    fun getPetById(id: Int): PetModel = allPets[id]
}
