package com.github.ruchir94.spring5webapp.controller;

import com.github.ruchir94.spring5webapp.model.Book;
import com.github.ruchir94.spring5webapp.model.Publisher;
import com.github.ruchir94.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private BookRepository bookRepository;

    /*This is the way of injecting the bean created by spring container to this class
    object/reference. Alternatively we can also use @Autowired Annotation
    @Autowired Annotation makes dependency injection on the basis of ByType and not on the basis of ByName - Important point to be remembered*/

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){

        //Creating dummy Book and Publisher Objects to display on Thymeleaf template page
        Book b = new Book();
        Publisher p = new Publisher();
        p.setId(1L);
        p.setName("Awesome Publishers");
        p.setAddress("Karve Nagar,Pune");
        b.setId(1L);
        b.setIsbn("ISBN-1");
        b.setTitle("Awesome Book");
        b.setPublisher(p);

        //The Below Line to be used when we have data in the Data Base and we want to display the data from DB
        //model.addAttribute("books",bookRepository.findAll());
        /*The Below Line of code displays the dynamic object which gets created when this controller is created and
        is displayed on the Thymeleaf Template Page */
        model.addAttribute("books",b);
        return "books";
    }
}
