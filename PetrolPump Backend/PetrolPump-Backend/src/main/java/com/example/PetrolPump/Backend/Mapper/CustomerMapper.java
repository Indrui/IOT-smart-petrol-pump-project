package com.example.PetrolPump.Backend.Mapper;

import com.example.PetrolPump.Backend.Dto.CustomerDto;
import com.example.PetrolPump.Backend.entity.Customer;

public class CustomerMapper {
     public static CustomerDto maptocustomer(Customer customer){
         return new CustomerDto(customer.getRfid(), customer.getFirstname(), customer.getLastname(), customer.getEmail(), customer.getBalanceamount());
     }
    public static Customer maptocustomerdto(CustomerDto customerdto){
        return new Customer(
                customerdto.getRfid(),
                customerdto.getFirstName(),
                customerdto.getLastName(),
                customerdto.getEmail(),
                customerdto.getBalance()
        );
    }
}
