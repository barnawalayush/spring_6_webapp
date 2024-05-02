package com.barnawal.spring_6_webapp.controllers;


import com.barnawal.spring_6_webapp.services.BookService;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Data
public class BookController {

    private final BookService bookService;


    @RequestMapping("/books")
    public String getBooks(Model model){

        model.addAttribute("books", bookService.findAll());

        return "books";  // It tells spring boot to look for view called books

    }

}
