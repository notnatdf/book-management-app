package com.example.book_management.mapper;

import com.example.book_management.model.Book;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface BookMapper {
    void insertBook(Book book);
    Book getBookById(Integer id);
    List<Book> getAllBooks();
    List<Book> searchBooks(String keyword);
    void updateBook(Book book);
    void deleteBook(Integer id);
}
