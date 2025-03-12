package gr.aueb.cf.blueapp.authentication;

import java.util.ArrayList;
import java.util.Arrays;

public class AuthenticationManager {

    private AuthenticationManager(){}

    public static boolean authenticate(String username, char[] password){
        return username.matches("blue") && Arrays.equals(password,
                "12345".toCharArray());
    }
}
