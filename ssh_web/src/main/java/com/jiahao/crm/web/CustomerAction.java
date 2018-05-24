package com.jiahao.crm.web;

import com.jiahao.crm.domain.Customer;
import com.jiahao.crm.service.CustomerService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

public class CustomerAction extends ActionSupport {
    private CustomerService customerService;

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    public CustomerService getCustomerService() {
        return customerService;
    }

    @Override
    public String execute() throws Exception {
        List<Customer> customerServiceAll = customerService.findAll();
        System.out.println("customer中的元素");
        System.out.println(customerServiceAll.size());
        ActionContext.getContext().put("list", customerServiceAll);
        return SUCCESS;

    }
}
