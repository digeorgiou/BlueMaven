package gr.aueb.cf.blueapp.dao;

import gr.aueb.cf.blueapp.dao.exceptions.CustomerDAOException;
import gr.aueb.cf.blueapp.model.Customer;

import java.util.List;

public interface ICustomerDAO {

    //Basic Services
    Customer insert(Customer customer) throws CustomerDAOException;
    Customer update(Customer customer) throws CustomerDAOException;
    void delete(Integer id) throws CustomerDAOException;
    Customer getById(Integer id) throws CustomerDAOException;
    List<Customer> getAll() throws CustomerDAOException;

    //Queries
    List<Customer> getByLastname(String lastname) throws CustomerDAOException;
    Customer getCustomerByVat(String vat) throws CustomerDAOException;
    Customer getCustomerByPhoneNumber(String phoneNumber) throws CustomerDAOException;

}
