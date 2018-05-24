package com.jiahao.crm.service.impl;

import com.jiahao.crm.dao.CustomerDao;
import com.jiahao.crm.domain.Customer;
import com.jiahao.crm.service.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private CustomerDao customerDao;

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public List<Customer> findAll() {
        return customerDao.findAll();
    }
}
