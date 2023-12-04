package com.example.shemajamebeli4

class Data : ArrayList<DataItem>()

data class DataItem(
    val id: Int,
    val image: String,
    val is_typing: Boolean,
    val last_active: String,
    val last_message: String,
    val laste_message_type: String,
    val owner: String,
    val unread_messages: Int,
    val itemType: ItemType = ItemType.TEXT
)

enum class ItemType{
    TEXT,
    FILE,
    VOICE
}
