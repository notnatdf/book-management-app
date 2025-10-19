package com.example.book_management.controller;

import com.example.book_management.model.Book;
import com.example.book_management.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public String listBooks(Model model, @RequestParam(required = false) String keyword){
        List<Book> books;
        if(keyword != null && !keyword.isEmpty()){
            books = bookService.searchBooks(keyword);
        } else{
            books = bookService.getAllBooks();
        }
        model.addAttribute("books", books);
        model.addAttribute("keyword", keyword);
        return "books/list";
    }

    @GetMapping("/new")
    public String showNewForm(Model model){
        model.addAttribute("book", new Book());
        return "books/form";
    }

    @PostMapping
    public String saveBook(@ModelAttribute Book book){
        bookService.saveBook(book);
        return "redirect:/books";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") Integer id, Model model){
        Book book = bookService.getBookById(id);
        model.addAttribute("book", book);
        return "books/form";
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable Integer id){
        bookService.deleteBook(id);
        return "redirect:/books";
    }
}
