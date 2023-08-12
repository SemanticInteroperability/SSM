package com.atguigu.spring.dao;

/**
 * @author lh
 * @date 2023/3/7 16:25
 */
public interface BookDao {

    //查询图书的价格
    Double getPriceByBookId(Integer bookId);

    // 更新图书的库存

    Integer updateStock(Integer bookId);


    //更新用户的余额
    Integer updateBalance(Integer userId,Double price);

}
