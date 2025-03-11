package gr.aueb.cf.blueapp.mapper;

import gr.aueb.cf.blueapp.dto.customer.CustomerInsertDTO;
import gr.aueb.cf.blueapp.dto.customer.CustomerReadOnlyDTO;
import gr.aueb.cf.blueapp.dto.customer.CustomerUpdateDTO;
import gr.aueb.cf.blueapp.model.Customer;

import java.util.Optional;

public class CustomerMapper {

    //για να γινει utility η κλαση.
    private CustomerMapper() {
    }

    public static Customer mapCustomerInsertToModel(CustomerInsertDTO dto){
        return new Customer(null, dto.getFirstname(),dto.getLastname(),
                dto.getPhoneNumber(), dto.getAddress(),dto.getEmail(),
                dto.getDOY(), dto.getVAT(),null , null);
    }

    public static Customer mapCustomerUpdateToModel(CustomerUpdateDTO dto){
        return new Customer(dto.getCustomerId(), dto.getFirstname(),dto.getLastname(),
                dto.getPhoneNumber(), dto.getAddress(),dto.getEmail(),
                dto.getDOY(), dto.getVAT(),null , null);
    }

    //βαζουμε Optional για να μην επιστρεφεται null
    public static Optional<CustomerReadOnlyDTO> mapCustomerToReadOnlyDTO(Customer customer){
        if (customer == null) return Optional.empty();
        return Optional.of(new CustomerReadOnlyDTO(customer.getCustomerId(),
                customer.getFirstname(),customer.getLastname(),
                customer.getPhoneNumber(), customer.getAddress(),
                customer.getEmail(), customer.getDOY(), customer.getVAT(),
                customer.getCreatedAt(), customer.getUpdatedAt()));
    }

}
