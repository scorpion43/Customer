package com.example.Service;

import com.example.Dao.CustomerDao;
import com.example.Entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by Mazek on 29.10.2016.
 */

@Service
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;

    public Collection<Customer> getAllCustomers(){
        return customerDao.getAllCustomer();
    }

    public Customer getCustomerById(int id){
        return this.customerDao.getCustomerById(id);
    }

    public void removeCustomerById(int id) {
        customerDao.removeCustomerById(id);
    }

    public void addCustomer(String name, String lastName, String phoneNumber) {
        customerDao.addCustomer(name, lastName, phoneNumber);
    }
}
