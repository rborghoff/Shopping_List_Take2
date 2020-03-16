package com.example.shoppinglisttake2

import android.os.FileObserver.DELETE
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ProductDao {

    @Query("SELECT * FROM  shoppinglistTable")
    suspend fun getAllProducts(): List<Shoppinglist>

    @Insert
    suspend fun insertProduct(shoppinglist: Shoppinglist)

    @Delete
    suspend fun deleteProduct (shoppinglist: Shoppinglist)

    @Query("DELETE FROM shoppinglistTable")
    suspend fun deleteAllProducts()
}