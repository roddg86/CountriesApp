package com.bignerdranch.android.countriesapp

import java.text.NumberFormat

fun formatNumber(number: Long): String{
    val string: String = NumberFormat.getInstance().format(number)
    return string
}