package com.github.ruchir94.spring5webapp.controller;

import com.github.ruchir94.spring5webapp.model.Author;
import com.github.ruchir94.spring5webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model){

        Author author = new Author();
        author.setId(1L);
        author.setFirstName("Awesome");
        author.setLastName("Author");

        model.addAttribute("authors",author);
        //model.addAttribute("authors",authorRepository.findAll());
        return  "authors";
    }
}
