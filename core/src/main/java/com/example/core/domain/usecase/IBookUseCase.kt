package com.example.core.domain.usecase

import com.example.core.data.Response
import com.example.core.domain.model.Book
import com.google.firebase.firestore.DocumentReference
import kotlinx.coroutines.flow.Flow

interface IBookUseCase {
    fun getAllBooks(): Flow<Response<List<Book>>>
    fun insertBook(book: Book):Flow<Response<DocumentReference>>
    fun deleteBook(book:Book):Flow<Response<Unit>>
}