package com.example.shoppinglisttake2

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "shoppinglistTable")
data class Shoppinglist (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID")
    var id: Long? = null,

    @ColumnInfo(name = "shopping_item")
    var shoppingItem: String,

            @ColumnInfo(name = "amount")
            var amount: Int



) : Parcelable