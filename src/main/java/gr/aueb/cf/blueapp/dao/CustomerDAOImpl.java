package gr.aueb.cf.blueapp.dao;

import gr.aueb.cf.blueapp.dao.exceptions.CustomerDAOException;
import gr.aueb.cf.blueapp.model.Customer;
import gr.aueb.cf.blueapp.util.DBUtil;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl implements ICustomerDAO {

    @Override
    public Customer insert(Customer customer) throws CustomerDAOException {
        String sql = "INSERT INTO customers (firstname, lastname," +
                "phone_number, vat, doy, address, email, created_at, " +
                "updated_at) VALUES (?,?,?,?,?,?,?,?,?)";

        Customer insertedCustomer = null;

        try(Connection connection = DBUtil.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql,
                    Statement.RETURN_GENERATED_KEYS)){

            ps.setString(1, customer.getFirstname());
            ps.setString(2, customer.getLastname());
            ps.setString(3, customer.getPhoneNumber());
            ps.setString(4, customer.getVAT());
            ps.setString(5, customer.getDOY());
            ps.setString(6, customer.getAddress());
            ps.setString(7, customer.getEmail());
            ps.setTimestamp(8, Timestamp.valueOf(LocalDateTime.now()));
            ps.setTimestamp(9, Timestamp.valueOf(LocalDateTime.now()));

            ps.executeUpdate();

            ResultSet rsGeneratedKeys = ps.getGeneratedKeys();
            if(rsGeneratedKeys.next()) {
                int generatedKey = rsGeneratedKeys.getInt(1);
                insertedCustomer = getById(generatedKey);
            }
            //logging
            return insertedCustomer;

        } catch(SQLException e){
            e.printStackTrace();
            //logging
            throw new CustomerDAOException("SQL Error. Customer with " +
                    "Lastname: " + customer.getLastname() + "was not inserted");
        }
    }

    @Override
    public Customer update(Customer customer) throws CustomerDAOException {
        String sql = "UPDATE customers SET firstname = ?, lastname = ?, " +
                "phone_number = ?, vat = ?, doy = ?, address = ?, email = ?, " +
                "updated_at = ? WHERE id = ?";

        Customer updatedCustomer = null;

        try(Connection connection = DBUtil.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql)){

            ps.setString(1, customer.getFirstname());
            ps.setString(2, customer.getLastname());
            ps.setString(3, customer.getPhoneNumber());
            ps.setString(4, customer.getVAT());
            ps.setString(5, customer.getDOY());
            ps.setString(6, customer.getAddress());
            ps.setString(7, customer.getEmail());
            ps.setTimestamp(8, Timestamp.valueOf(LocalDateTime.now()));
            ps.setInt(9, customer.getCustomerId());

            ps.executeUpdate();

            updatedCustomer = getById(customer.getCustomerId());


            //logging


            return updatedCustomer;

        } catch(SQLException e){
            e.printStackTrace();
            //logging
            throw new CustomerDAOException("SQL Error. Customer with " +
                    "ID: " + customer.getCustomerId() + "was not updated");
        }
    }

    @Override
    public void delete(Integer id) throws CustomerDAOException {
        String sql = "DELETE FROM customers WHERE id = ?";

        try(Connection connection = DBUtil.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql)){

            ps.setInt(1, id);
            ps.executeUpdate();
            //logging
        } catch (SQLException e) {
            e.printStackTrace();
            //logging
            throw new CustomerDAOException("SQL Error. Customer with id: " + id + " not deleted.");
        }


    }

    @Override
    public Customer getById(Integer id) throws CustomerDAOException {
        String sql = "SELECT * FROM customers WHERE id = ?";
        Customer customer = null;
        ResultSet rs;

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)){

            ps.setInt(1,id);
            rs = ps.executeQuery();

            if(rs.next()){
                customer = new Customer(rs.getInt("id"), rs.getString(
                        "firstname"), rs.getString("lastname"), rs.getString(
                                "phone_number"), rs.getString("address"),
                        rs.getString("email"), rs.getString("doy"),
                        rs.getString("vat"),
                        rs.getTimestamp("created_at").toLocalDateTime(),
                        rs.getTimestamp("updated_at").toLocalDateTime());
            }
            return customer;
        } catch(SQLException e){
            e.printStackTrace();
            //logging
            throw new CustomerDAOException("SQL Error. Customer with " +
                    "ID: " + id + "was not found");
        }
    }

    @Override
    public List<Customer> getAll() throws CustomerDAOException {
        String sql = "SELECT * FROM customers";
        Customer customer = null;
        List<Customer> customers = new ArrayList<>();
        ResultSet rs;

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)){

            rs = ps.executeQuery();

            while(rs.next()){
                customer = getById(rs.getInt("id"));
                customers.add(customer);
            }
            return customers;
        } catch(SQLException e){
            e.printStackTrace();
            //logging
            throw new CustomerDAOException("SQL Error. Error in getAll " +
                    "customers");
        }

    }

    @Override
    public List<Customer> getByLastname(String lastname) throws CustomerDAOException {
        String sql = "SELECT * FROM customers WHERE lastname LIKE ?";
        Customer customer = null;
        List<Customer> customers = new ArrayList<>();
        ResultSet rs;

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)){

            ps.setString(1, lastname + "%");
            rs = ps.executeQuery();

            while(rs.next()){
                customer = getById(rs.getInt("id"));
                customers.add(customer);
            }
            return customers;
        } catch(SQLException e){
            e.printStackTrace();
            //logging
            throw new CustomerDAOException("SQL Error. Error in " +
                    "getCustomerByLastName");
        }
    }

    @Override
    public Customer getCustomerByVat(String vat) throws CustomerDAOException {
        String sql = "SELECT * FROM customers WHERE vat = ?";
        Customer customer = null;
        ResultSet rs;

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)){

            ps.setString(1,vat);
            rs = ps.executeQuery();

            if(rs.next()){
                customer = new Customer(rs.getInt("id"), rs.getString(
                        "firstname"), rs.getString("lastname"), rs.getString(
                        "phone_number"), rs.getString("address"),
                        rs.getString("email"), rs.getString("doy"),
                        rs.getString("vat"),
                        rs.getTimestamp("created_at").toLocalDateTime(),
                        rs.getTimestamp("updated_at").toLocalDateTime());
            }
            return customer;
        } catch(SQLException e){
            e.printStackTrace();
            //logging
            throw new CustomerDAOException("SQL Error. Customer with " +
                    "VAT: " + vat + "was not found");
        }

    }

    @Override
    public Customer getCustomerByPhoneNumber(String phoneNumber) throws CustomerDAOException {
        String sql = "SELECT * FROM customers WHERE phone_number = ?";
        Customer customer = null;
        ResultSet rs;

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)){

            ps.setString(1,phoneNumber);
            rs = ps.executeQuery();

            if(rs.next()){
                customer = new Customer(rs.getInt("id"), rs.getString(
                        "firstname"), rs.getString("lastname"), rs.getString(
                        "phone_number"), rs.getString("address"),
                        rs.getString("email"), rs.getString("doy"),
                        rs.getString("vat"),
                        rs.getTimestamp("created_at").toLocalDateTime(),
                        rs.getTimestamp("updated_at").toLocalDateTime());
            }
            return customer;
        } catch(SQLException e){
            e.printStackTrace();
            //logging
            throw new CustomerDAOException("SQL Error. Customer with " +
                    "Phone Number: " + phoneNumber + "was not found");
        }
    }

}
