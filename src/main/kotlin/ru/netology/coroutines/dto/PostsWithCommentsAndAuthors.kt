package ru.netology.coroutines.dto

data class PostsWithCommentsAndAuthors(
    val post: Post,
    val author: Author,
    val commentWithAuthor: List<CommentWithAuthor>
)