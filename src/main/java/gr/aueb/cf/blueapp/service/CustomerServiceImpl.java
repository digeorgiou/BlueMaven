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
import java.util.Optional;
import java.util.stream.Collectors;

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
    public CustomerReadOnlyDTO updateCustomer(Integer id, CustomerUpdateDTO dto)
            throws CustomerDAOException, CustomerAlreadyExistsException, CustomerNotFoundException {
        Customer customer;
        Customer fetchedCustomer;
        Customer updatedCustomer;

        try{
            if(customerDAO.getById(id)==null){
                throw new CustomerNotFoundException("Teacher with id: " + id + "was not found");
            }

            fetchedCustomer =
                    customerDAO.getCustomerByPhoneNumber(dto.getPhoneNumber());
            if(fetchedCustomer != null && !fetchedCustomer.getCustomerId().equals(dto.getCustomerId())){
                throw new CustomerAlreadyExistsException("Customer with Phone" +
                        "Number: " + dto.getPhoneNumber() + " already exists");
            }

            customer = CustomerMapper.mapCustomerUpdateToModel(dto);
            updatedCustomer = customerDAO.update(customer);

            //logging

            return CustomerMapper.mapCustomerToReadOnlyDTO(updatedCustomer)
                    .orElseThrow(()->new CustomerDAOException("Error during mapping"));



        } catch(CustomerDAOException | CustomerAlreadyExistsException |CustomerNotFoundException
                e) {
            //logging
            //rollback
            throw e;
        }
    }

    @Override
    public void deleteCustomer(Integer id) throws CustomerDAOException, CustomerNotFoundException {
        try{
            if(customerDAO.getById(id) == null) {
                throw new CustomerNotFoundException("Teacher with id " + id + " not found");
            }
            //logging
            customerDAO.delete(id);

        }catch (CustomerDAOException | CustomerNotFoundException e){
            e.printStackTrace();
            //logging
            //rollback
            throw e;
        }
    }

    @Override
    public CustomerReadOnlyDTO getCustomerById(Integer id) throws CustomerDAOException, CustomerNotFoundException {
        Customer customer;

        try{
            customer = customerDAO.getById(id);

            return CustomerMapper.mapCustomerToReadOnlyDTO(customer)
                    .orElseThrow(()-> new CustomerNotFoundException("Customer" +
                            " with id " + id + "was not found"));
        } catch(CustomerDAOException | CustomerNotFoundException e){
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public List<CustomerReadOnlyDTO> getAllCustomers() throws CustomerDAOException {
        List<Customer> customers;

        try{
            customers = customerDAO.getAll();

            return customers.stream()
                    .map(CustomerMapper::mapCustomerToReadOnlyDTO)
                    .flatMap(Optional::stream) //η flatMap αφαιρει τα nulls
                    .collect(Collectors.toList());

            //εναλλακτικα
            //return customers.stream()
            //.map(c -> CustomerMapper.mapCustomerToReadOnlyDTO(c).orElse(null))
            //.collect(Collectors.toList())


        }catch (CustomerDAOException e){
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public List<CustomerReadOnlyDTO> getCustomerByLastname(String lastname) throws CustomerDAOException {
        List<Customer> customers;

        try{
            customers = customerDAO.getByLastname(lastname);

            return customers.stream()
                    .map(CustomerMapper::mapCustomerToReadOnlyDTO)
                    .flatMap(Optional::stream) //η flatMap αφαιρει τα nulls
                    .collect(Collectors.toList());

            //εναλλακτικα
            //return customers.stream()
            //.map(c -> CustomerMapper.mapCustomerToReadOnlyDTO(c).orElse(null))
            //.collect(Collectors.toList())


        }catch (CustomerDAOException e){
            e.printStackTrace();
            throw e;
        }
    }
}
