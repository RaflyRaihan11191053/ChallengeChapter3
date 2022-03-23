package com.example.challengechapter3

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataUser(val sukuAwal: Int, val selisih: Int, val sukuN: Int): Parcelable {
}