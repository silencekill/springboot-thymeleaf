package org.javaboy.thymeleaf.controller;

import org.javaboy.thymeleaf.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class BookController {

    @GetMapping("get")
    public String book(Model model){
        ArrayList<Book> list = new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add(new Book(i, "书名" + "i"));
        }
        model.addAttribute("books",list);
        return "book";
    }
}
