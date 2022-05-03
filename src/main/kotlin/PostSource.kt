enum class Type {
    vk, widget, api, rss, sms
}

enum class Platform {
    android, iphone, wphone
}

enum class DataTypePostSource {
    profile_activity, profile_photo, comments, like, poll
}

data class PostSource(
    val type: Type,
    val platform: Platform,
    val data: DataTypePostSource?,
    val url: String,
)