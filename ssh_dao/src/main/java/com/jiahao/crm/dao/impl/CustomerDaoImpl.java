package com.jiahao.crm.dao.impl;

import com.jiahao.crm.dao.CustomerDao;
import com.jiahao.crm.domain.Customer;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class CustomerDaoImpl extends HibernateDaoSupport implements
        CustomerDao {

    @Override
    public List<Customer> findAll() {
        return (List<Customer>) this.getHibernateTemplate().find("from " +
                "Customer");
    }
}
