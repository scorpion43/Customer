package com.example.Dao;

import com.example.Entity.Customer;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.put;

/**
 * Created by Mazek on 29.10.2016.
 */

@Repository
public class CustomerDao {

    private static Map<Integer, Customer> customers;

    static {
        customers = new HashMap<Integer, Customer>(){
            {
                put(1, new Customer(1, "Karol", "Lukaszuk", "798734507"));
                put(2, new Customer(2, "Justyna", "Komarowska", "798734507"));
                put(3, new Customer(3, "Rafał", "Orluk", "798734507"));
                put(4, new Customer(4, "Lukasz", "Tymoszuk", "798734507"));
            }
        };
    }

    public Collection<Customer> getAllCustomer(){
        return this.customers.values();
    }

    public Customer getCustomerById(int id){
        return this.customers.get(id);
    }

    public void removeCustomerById(int id) {
        this.customers.remove(id);
    }

    public void addCustomer(String name, String lastName, String phoneNumber) {
        customers.put(customers.size()+1, new Customer(customers.size()+1,  name, lastName, phoneNumber));
    }
}
