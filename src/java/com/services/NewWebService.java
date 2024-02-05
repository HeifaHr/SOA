/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author MSI
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
   @WebMethod(operationName = "show")
    public int numberOfNumbers(String inputString) {
        //verifier le string input est nul ou empty
        if (inputString == null || inputString.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be null or empty");
        }

        // Count the number of digits in the input string
        int count = 0;
        for (char c : inputString.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }

        return count;
    }
    
    
}
   