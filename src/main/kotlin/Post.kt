import java.lang.RuntimeException

enum class PostType {
    Post, Copy, Reply, Postpone, Suggest
}

data class Post(
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    val comments: Array<Comments>?,
    val copyright: Copyright,
    val likes: Likes,
    val reposts: Reposts,
    val views: Views,
    val postType: PostType,
    val signerId: Int,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val donut: Donut,
    val postponedId: Boolean,
    val postSource: PostSource?,
    val geo: Geo?,
    val copyHistory: Array<String>?,
    val attachment: Attachment?
)
class PostNotFoundException(message : String) : RuntimeException(message)


data class Comments(
    val id: Int,
    val postId : Int,
    val fromId : Int,
    val data: Int,
    val text: String,
    val replyToUser: Int,
    val replyToComment: Int,
)

data class Copyright(
    val id: Int,
    val link: String,
    val name: String,
    val type: String,
)

data class Likes(
    val count: Int,
    val userLikes: Boolean,
    val canLike: Boolean,
    val canPublish: Boolean,
)

data class Donut(
    val isDonut: Boolean,
    val paidDuration: Int,
    val placeholder: String,
    val canPublishFreeCopy: Boolean,
    val editMode: String,
)

data class Reposts(
    val count: Int,
    val userReposted: Boolean,
)

data class Views(val count: Int)