package com.atguigu.spring.sercvice;

/**
 * @author lh
 * @date 2023/3/8 9:28
 */
public interface CheckOutService {
    void checkOut(Integer userId,Integer[] bookIds);
}
