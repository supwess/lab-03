package com.example.listycity3

import androidx.compose.runtime.mutableStateListOf

class CityRepository {
    private val _cities = mutableStateListOf(
        City("Edmonton", "AB"),
        City("Vancouver", "BC"),
        City("Toronto", "ON")
    )

    val cities: List<City>
        get() = _cities

    fun addCity(city: City) {
        _cities.add(city)
    }

    fun updateCity(oldCity: City, newCity: City) {
        val cityIndex: Int = _cities.indexOf(oldCity)

        if (cityIndex != -1) {
            _cities[cityIndex] = newCity
        }
    }
}