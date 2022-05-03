object WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comments>()

    fun add(newPost: Post): Post {
        posts += newPost
        return posts.last()
    }

    fun createComment(comment: Comments): Comments {
        for (post in posts) {
            if (post.id == comment.postId) {
                comments += comment
            } else {
                throw PostNotFoundException("Пост с таким id *${post.id}* не найден")
            }
        }
        return comments.last()
    }


    fun update(newPost: Post): Boolean {
        val postId = newPost.id
        for ((index, post) in posts.withIndex()) {
            if (post.id == postId) {
                val ownerIdOld = posts[index].ownerId
                val dateOld = posts[index].date
                posts[index] = newPost.copy(ownerId = ownerIdOld, date = dateOld)

                return true
            }
        }
        return false
    }

    fun print() {
        for (post in posts) {
            println("post.id = " + post.id +
                    ", post.ownerId = " + post.ownerId +
                    ", date = " + post.date +
                    ", text = " + post.text +
                    ", attachments = " + post.attachment
            )
        }
    }

    fun clearArray() {
        posts = emptyArray()
    }
}

