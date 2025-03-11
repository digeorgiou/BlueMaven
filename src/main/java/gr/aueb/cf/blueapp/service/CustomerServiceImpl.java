package gr.aueb.cf.blueapp.service;

import gr.aueb.cf.blueapp.dao.ICustomerDAO;
import gr.aueb.cf.blueapp.dao.exceptions.CustomerDAOException;
import gr.aueb.cf.blueapp.dto.customer.CustomerInsertDTO;
import gr.aueb.cf.blueapp.dto.customer.CustomerReadOnlyDTO;
import gr.aueb.cf.blueapp.dto.customer.CustomerUpdateDTO;
import gr.aueb.cf.blueapp.exceptions.CustomerAlreadyExistsException;
import gr.aueb.cf.blueapp.exceptions.CustomerNotFoundException;
import gr.aueb.cf.blueapp.mapper.CustomerMapper;
import gr.aueb.cf.blueapp.model.Customer;

import java.util.List;

public class CustomerServiceImpl implements ICustomerService{

    private final ICustomerDAO customerDAO;

    //dependency injection of DAO into service (Constructor injection)
    public CustomerServiceImpl(ICustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Override
    public CustomerReadOnlyDTO insertCustomer(CustomerInsertDTO dto)
            throws CustomerDAOException, CustomerAlreadyExistsException {
        Customer customer;
        Customer insertedCustomer;

        try{
            customer = CustomerMapper.mapCustomerInsertToModel(dto);
            if(customerDAO.getCustomerByPhoneNumber(dto.getPhoneNumber()) != null)
                throw new CustomerAlreadyExistsException("Customer with Phone" +
                        " Number " + dto.getPhoneNumber() + " already exists");

            insertedCustomer = customerDAO.insert(customer);

            //logging (συνηθως το logging γινεται στο service)

            //το mapCustomerToReadOnlyDTO επιστρεφει Optional
            //το Optional μας δινει τις μεθοδους .
            // orElse που μετατρεπει το Optional σε Entity και αν ειναι empty
            // του δινουμε μια default τιμη. εδω null
            // και orElseThrow που αν ειναι empty δινει exception (σε μορφη
            // lambda).
            return CustomerMapper.mapCustomerToReadOnlyDTO(insertedCustomer)
                    //.orElse(null);
                    .orElseThrow(() -> new CustomerDAOException("Error in " +
                            "Mapping"));

        } catch(CustomerDAOException | CustomerAlreadyExistsException e) {
            //logging
            //rollback
            throw e;
        }
    }

    @Override
    public CustomerReadOnlyDTO updateCustomer(CustomerUpdateDTO dto)
            throws CustomerDAOException, CustomerAlreadyExistsException, CustomerNotFoundException {
        return null;
    }

    @Override
    public void deleteCustomer(Integer id) throws CustomerDAOException, CustomerNotFoundException {

    }

    @Override
    public CustomerReadOnlyDTO getCustomerById(Integer id) throws CustomerDAOException, CustomerNotFoundException {
        return null;
    }

    @Override
    public List<CustomerReadOnlyDTO> getAllCustomers() throws CustomerDAOException {
        return List.of();
    }

    @Override
    public List<CustomerReadOnlyDTO> getCustomerByLastname(String lastname) throws CustomerDAOException {
        return List.of();
    }
}
