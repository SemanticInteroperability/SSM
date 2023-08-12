package com.atguigu.spring.dao.impl;

import com.atguigu.spring.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author lh
 * @date 2023/3/7 16:25
 */

@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public Double getPriceByBookId(Integer bookId) {
        String sql = "select price from t_book where book_id=?";
        return jdbcTemplate.queryForObject(sql,Double.class,bookId);
    }

    public Integer updateStock(Integer bookId) {
        String sql = "update t_book set stock = stock-1 where book_id =?";
        return jdbcTemplate.update(sql,bookId);
    }

    public Integer updateBalance(Integer userId, Double price) {
        String sql = "update t_user set balance = balance - ? where user_id = ?";
        return jdbcTemplate.update(sql,price,userId);
    }
}
