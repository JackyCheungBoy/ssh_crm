package com.jiahao.test;

import com.jiahao.crm.dao.CustomerDao;
import com.jiahao.crm.domain.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-dao.xml")
public class CustomerTest {
    @Resource(name = "customerDao")
    private CustomerDao customerDao;

    @Test
    public void testFindAll() {
        List<Customer> list = customerDao.findAll();
        System.out.println(list.size());
    }

}
