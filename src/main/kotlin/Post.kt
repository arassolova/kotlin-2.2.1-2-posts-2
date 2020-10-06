data class Post(
    var id: Long = 0,
    val ownerId: Long = 0,
    val text: String = "default text",
    val likes: Int = 0,
    val date: String = "0 pm"
) {

    //написать сет для ид, чтобы его нельзя было устанавливать?
    fun printPost(){
        println("id: $id, owner id: $ownerId, " +
                "text: $text, " +
                "likes: $likes, date: $date")
    }

    fun correctPostByPost(post: Post): Post {
        val post: Post = Post(
            id = this.id,
            ownerId = this.ownerId,
            text = post.text,
            likes = post.likes,
            date = this.date)
        return post
    }

    fun correctPostText(text: String): Post {
        val post: Post = Post(
            id = this.id,
            ownerId = this.ownerId,
            text = text,
            likes = this.likes,
            date = this.date)
        return post
    }

}