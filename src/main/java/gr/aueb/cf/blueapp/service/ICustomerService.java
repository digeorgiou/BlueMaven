package gr.aueb.cf.blueapp.service;

import gr.aueb.cf.blueapp.dao.exceptions.CustomerDAOException;
import gr.aueb.cf.blueapp.dto.customer.CustomerInsertDTO;
import gr.aueb.cf.blueapp.dto.customer.CustomerReadOnlyDTO;
import gr.aueb.cf.blueapp.dto.customer.CustomerUpdateDTO;
import gr.aueb.cf.blueapp.exceptions.CustomerAlreadyExistsException;
import gr.aueb.cf.blueapp.exceptions.CustomerNotFoundException;

import java.util.List;

public interface ICustomerService {

    CustomerReadOnlyDTO insertCustomer(CustomerInsertDTO dto)
        throws CustomerDAOException, CustomerAlreadyExistsException;

    CustomerReadOnlyDTO updateCustomer(Integer id, CustomerUpdateDTO dto)
        throws CustomerDAOException, CustomerAlreadyExistsException,
            CustomerNotFoundException;

    void deleteCustomer(Integer id) throws CustomerDAOException,
            CustomerNotFoundException;

    CustomerReadOnlyDTO getCustomerById(Integer id) throws
            CustomerDAOException, CustomerNotFoundException;

    List<CustomerReadOnlyDTO> getAllCustomers() throws CustomerDAOException;

    List<CustomerReadOnlyDTO> getCustomerByLastname(String lastname) throws CustomerDAOException;
}
