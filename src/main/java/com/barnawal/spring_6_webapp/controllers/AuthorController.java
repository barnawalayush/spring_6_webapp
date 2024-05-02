package com.barnawal.spring_6_webapp.controllers;

import com.barnawal.spring_6_webapp.services.AuthorService;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Data
public class AuthorController {

    private final AuthorService authorService;


    @RequestMapping("/authors")
    public String getAuthors(Model model){

        model.addAttribute("authors", authorService.findAll());

        return "authors";
    }


}
