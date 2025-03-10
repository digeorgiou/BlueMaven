package gr.aueb.cf.blueapp;

import gr.aueb.cf.blueapp.dao.CustomerDAOImpl;
import gr.aueb.cf.blueapp.dao.exceptions.CustomerDAOException;
import gr.aueb.cf.blueapp.model.Customer;

public class TestMain {

    public static void main(String[] args) {

        Customer marina = new Customer(11, "Marina", "Karasmani",
                "2106454575", "Leuktron 2",
                "marina45@gmail.com", "Ψυχικού", "0001221", null, null);

        CustomerDAOImpl customerDAO = new CustomerDAOImpl();

        try{
            customerDAO.update(marina);
            System.out.println(marina.getVAT());
            System.out.println(marina.getDOY());
        } catch (CustomerDAOException e) {
            System.out.println(e.getMessage());;
        }
    }
}
