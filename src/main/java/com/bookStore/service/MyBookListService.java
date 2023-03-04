package com.bookStore.service;

import com.bookStore.entity.MyBookList;
import com.bookStore.repository.MyBookRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBookListService {

    @Autowired
    private MyBookRepository myBookRepository;

    @Transactional
    public void saveMyBooks(MyBookList myBookList) {
        myBookRepository.save(myBookList);
    }

    @Transactional
    public List<MyBookList> getAllMyBooks() {
        return myBookRepository.findAll();
    }
}
