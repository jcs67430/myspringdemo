package com.example.sedemo.service;

import com.example.sedemo.domain.Book;
import com.example.sedemo.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@RequiredArgsConstructor
@Service
public class BookService {

    private final BookRepository bookRepository;

    @Transactional
    public Book create(Book book){
        return bookRepository.save(book);
    }


    @Transactional(readOnly = true)
    public List<Book> findAll(){
        return bookRepository.findAll();
    }

}
