package com.dicoding.picodiploma.projekuts

data class fakultas(
        var name: String = "",
        var detail: String = "",
        var photo: Int = 0,
        var web: String = "",
        var email: String = "",
        var linkJurusan: Array<String>
)