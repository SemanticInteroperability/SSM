package com.atguigu.spring.controller;

import com.atguigu.spring.sercvice.BookService;
import com.atguigu.spring.sercvice.CheckOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author lh
 * @date 2023/3/7 16:27
 */

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private CheckOutService checkOutService;

    public void buyBook(Integer userId,Integer bookId){
        bookService.buyBook(userId,bookId);
    }

    public void CheckOut(Integer userId,Integer[] bookIds){
        checkOutService.checkOut(userId,bookIds);
    }

}
