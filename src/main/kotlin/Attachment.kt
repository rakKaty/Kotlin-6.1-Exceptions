sealed class Attachment(val type: String)


data class PhotoAttachment(val photo: Photo) : Attachment("photo")
data class LinkAttachment(val link: Link) : Attachment("link")
data class AudioAttachment(val audio: Audio) : Attachment("audio")
data class StickerAttachment(val sticker: Sticker) : Attachment("sticker")
data class GraffitiAttachment(val graffiti: Graffiti) : Attachment("graffiti")


data class Photo(
    val id: Int,
    val albumId: Int,
    val ownerId: Int,
    val userId: Int,
    val text: String,
    val date: Int,
    val sizes: Array<PhotoSizes>,
    val width: Int,
    val height: Int,
)

data class PhotoSizes(val type: String, val url: String, val width: Int, val height: Int)


data class Link(
    val url: String,
    val title: String,
    val caption: String,
    val description: String,
    val photo: Photo?,
    val product: Int,
    val button: Button?,
    val previewPage: String,
    val previewUrl: String,
)

data class Button(val type: String)


data class Audio(
    val id: Int,
    val ownerId: Int,
    val artist: String,
    val title: String,
    val duration: Int,
    val url: String,
    val lyricsId: Int,
    val albumId: Int,
    val genreId: Int,
    val date: Int,
    val noSearch: Boolean,
    val isHq: Boolean,
)


data class Sticker(
    val productId: Int,
    val stickerId: Int,
    val images: Array<ImagesTransparentBackground>,
    val imagesWithBackground: Array<ImagesWithBackground>,
)

data class ImagesTransparentBackground(val url: String, val width: Int, val height: Int)
data class ImagesWithBackground(val url: String, val width: Int, val height: Int)


data class Graffiti(
    val id: Int,
    val ownerId: Int,
    val photo130: String,
    val photo604: String,
)
