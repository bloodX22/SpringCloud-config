package com.hqj.springcloud.dao;

import com.hqj.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @auther zzyy
 * @create 2020-01-27 20:21
 */
@Mapper
public interface PaymentDao
{
    public int create(Payment payment);


    public Payment getPaymentById(@Param("id") Long id);
}


