package com.apptive.easywine.enums

import com.apptive.easywine.R

enum class StorageWineInfo (
    val country: String,
    val nationalFlag: Int
    ){
    France("프랑스", R.drawable.france),
    Italia("이탈리아", R.drawable.italy),
    Spain("스페인", R.drawable.spain),
    RepublicOfSouthAfrica("남아프리카공화국", R.drawable.republic_of_south_africa),
    USA("미국", R.drawable.usa),
    Australia("호주", R.drawable.australia),
    NewZealand("뉴질랜드", R.drawable.new_zealand),
    Chile("칠레", R.drawable.chile),
    Argentina("아르헨티나", R.drawable.argentina),
    Japan("일본",R.drawable.japan),
    Portugal("포르투갈", R.drawable.portugal),
    Germany("독일", R.drawable.germany);
    companion object {
        private val map = StorageWineInfo.values().associateBy(StorageWineInfo::country)
        fun fromCountryName(name: String) = map[name]
    }
}