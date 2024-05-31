package com.example.inventory.data
@Dao
interface ItemDao {
    @Insert
    suspend fun insert(item: Item)
}