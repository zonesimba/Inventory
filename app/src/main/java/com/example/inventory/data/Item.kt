

package com.example.inventory.data

@Entity(tableName = "items")
data class Item(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val id: Int = 0,
    val name: String,
    val price: Double,
    val quantity: Int
)
