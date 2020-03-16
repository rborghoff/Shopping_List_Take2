package com.example.shoppinglisttake2

import android.content.Context

class ProductRepository (context: Context) {

    private val productDao: ProductDao

    init {
        val database =
            ShoppingListRoomDatabase.getDatabase(context)
        productDao = database!!.productDao()
    }

    suspend fun getAllProducts(): List<Shoppinglist> = productDao.getAllProducts()

    suspend fun insertProduct(shoppingList: Shoppinglist) = productDao.insertProduct(shoppingList)

    suspend fun deleteProduct(shoppingList: Shoppinglist) = productDao.deleteProduct(shoppingList)

    suspend fun deleteAllProducts() = productDao.deleteAllProducts()


}
