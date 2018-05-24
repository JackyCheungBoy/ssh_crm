package com.jiahao.test;

import com.jiahao.crm.domain.Customer;
import com.jiahao.crm.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-service.xml")
public class CustomerTest {
    @Resource(name = "customerService")
    private CustomerService customerService;

    @Test
    public void testFindAll() {
        List<Customer> list = customerService.findAll();
        System.out.println(list.size());
    }
}
