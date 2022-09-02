package com.bignerdranch.android.countriesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.bignerdranch.android.countriesapp.databinding.ActivityMainBinding
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /* обработчик клика по кнопк */
        binding.searchButton.setOnClickListener {
            val countryName = binding.countryNameEditText.text.toString()

            /* создание корутины(легковесного потока),
            весь код внутри будет выполняться в отдельном потоке*/
            lifecycleScope.launch {
                /* сделать запрос к api */
                val countries = restCountriesApi.getCountryByName(countryName)
                val country = countries[0]

                /* размещение сконвертированных данных на view */
                binding.countryNameTextView.text = country.name
                binding.capitalTextView.text = country.capital
                binding.populationTextView.text = country.population.toString()
                binding.areaTextView.text = country.area.toString()
                binding.languagesTextView.text = country.languages.toString()
            }
        }
    }
}