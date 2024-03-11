package com.example.sedemo.controller;

import com.example.sedemo.domain.Book;
import com.example.sedemo.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class BookController {


    private final BookService bookService;

    @GetMapping("/hello")
    public String HelloWorld(){
        return "Hello World!!!";
    }


    //Restful API
    //HTTP methods : GET, POST, PUT, DELETE
    //return HTTP status code

    @PostMapping("/book")
    public ResponseEntity<?> save(@RequestBody Book book){
        return new ResponseEntity<>(bookService.create(book), HttpStatus.CREATED);
    }


    @GetMapping("/books")
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(bookService.findAll(), HttpStatus.OK);
    }


}
