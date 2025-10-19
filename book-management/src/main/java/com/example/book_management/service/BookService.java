package com.example.book_management.service;

import com.example.book_management.mapper.BookMapper;
import com.example.book_management.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookMapper bookMapper;

    public void saveBook(Book book){
        if (book.getId() != null){
            bookMapper.updateBook(book);
        } else{
            bookMapper.insertBook(book);
        }
    }

    public Book getBookById(Integer id){
        return bookMapper.getBookById(id);
    }

    public List<Book> getAllBooks(){
        return bookMapper.getAllBooks();
    }

    public List<Book> searchBooks(String keyword){
        return bookMapper.searchBooks(keyword);
    }

    public void deleteBook(Integer id){
        bookMapper.deleteBook(id);
    }
}
