package com.atguigu.spring.sercvice.impl;

import com.atguigu.spring.sercvice.BookService;
import com.atguigu.spring.sercvice.CheckOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author lh
 * @date 2023/3/8 9:28
 */
@Service
public class CheckOutServiceImpl implements CheckOutService {
    @Autowired
    private BookService bookService;

    @Transactional
    public void checkOut(Integer userId, Integer[] bookIds) {
        for (Integer bookId : bookIds) {
            bookService.buyBook(userId,bookId);
        }
    }
}
