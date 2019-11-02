package dao;

import models.Customer;

public interface CustomerDAO {

    public int insertCustomer(Customer c);
    public Customer getCustomer(String username, String password);

}
