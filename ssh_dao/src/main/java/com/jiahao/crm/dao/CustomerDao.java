package com.jiahao.crm.dao;

import com.jiahao.crm.domain.Customer;

import java.util.List;

public interface CustomerDao {
    public List<Customer> findAll();
}
