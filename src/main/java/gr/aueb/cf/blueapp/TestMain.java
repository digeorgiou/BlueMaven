package gr.aueb.cf.blueapp;

import gr.aueb.cf.blueapp.dao.CustomerDAOImpl;
import gr.aueb.cf.blueapp.dao.exceptions.CustomerDAOException;
import gr.aueb.cf.blueapp.model.Customer;

public class TestMain {

    public static void main(String[] args) {

        String password = System.getenv("PASSWD_USER7");
        if (password == null) {
            System.out.println("Environment variable PASSWD is not set.");
        } else {
            System.out.println("Password: " + password);
        }
    }
}
