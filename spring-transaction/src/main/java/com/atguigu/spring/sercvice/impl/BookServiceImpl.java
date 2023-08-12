package com.atguigu.spring.sercvice.impl;

import com.atguigu.spring.dao.BookDao;
import com.atguigu.spring.sercvice.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author lh
 * @date 2023/3/7 16:27
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Transactional(
            /**
             * @Transactional(propagation = Propagation.REQUIRED)，默认情况，表示如果当前线程上有已经开
             * 启的事务可用，那么就在这个事务中运行。经过观察，购买图书的方法buyBook()在checkout()中被调
             * 用，checkout()上有事务注解，因此在此事务中执行。所购买的两本图书的价格为80和50，而用户的余
             * 额为100，因此在购买第二本图书时余额不足失败，导致整个checkout()回滚，即只要有一本书买不
             * 了，就都买不了
             * @Transactional(propagation = Propagation.REQUIRES_NEW)，表示不管当前线程上是否有已经开启
             * 的事务，都要开启新事务。同样的场景，每次购买图书都是在buyBook()的事务中执行，因此第一本图
             * 书购买成功，事务结束，第二本图书购买失败，只在第二次的buyBook()中回滚，购买第一本图书不受
             * 影响，即能买几本就买几本
            */
            propagation = Propagation.REQUIRES_NEW
    )
    //注:被@Transaction标识后我们拿到的是的它的代理
    public void buyBook(Integer userId, Integer bookId) {
        //查询图书的价格
        Double price = bookDao.getPriceByBookId(bookId);

        // 更新图书的库存
        bookDao.updateStock(bookId);


        //更新用户的余额
        bookDao.updateBalance(userId,price);
    }
}
