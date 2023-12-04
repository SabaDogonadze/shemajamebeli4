package com.example.shemajamebeli4

import androidx.lifecycle.ViewModel

class itemsViewModel : ViewModel() {

    val items = mutableListOf<DataItem>(
        DataItem(
            id = 1,
            image = "https://www.alia.ge/wp-content/uploads/2022/09/grisha.jpg",
            is_typing = false,
            last_active = "4:20 PM",
            last_message = "თავის ტერიტორიას ბომბავდა",
            laste_message_type = "text",
            owner = "გრიშა ონიანი",
            unread_messages = 0
        ),
        DataItem(
            id = 2,
            image = "null",
            is_typing = true,
            last_active = "3:00 AM",
            last_message = "შემოგევლე",
            laste_message_type = "voice",
            owner = "ჯემალ კაკაურიძე",
            unread_messages = 0,
            ItemType.VOICE

        ),
        DataItem(
            id = 3,
            image = "https://i.ytimg.com/vi/KYY0TBqTfQg/hqdefault.jpg",
            is_typing = false,
            last_active = "1:00",
            last_message = "ცოცხალი ვარ მა რა ვარ შე.. როდის იყო კვტარი ტელეფონზე ლაპარაკობდა",
            laste_message_type = "file",
            owner = "გურამ ჯინორია",
            unread_messages = 0,
            ItemType.FILE
        ),
        DataItem(
            id = 4,
            image = "",
            is_typing = false,
            last_active = "1:00 PM",
            last_message = "ადამიანი რო მოსაკლავად გაგიმეტებს თანაც ქალი ის დასანდობი არ არი",
            laste_message_type = "text",
            owner = "კაკო წენგუაშვილი",
            unread_messages = 0
        )

    )
}