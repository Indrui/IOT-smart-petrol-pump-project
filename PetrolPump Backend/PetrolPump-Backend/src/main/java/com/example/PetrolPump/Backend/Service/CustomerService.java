package com.example.PetrolPump.Backend.Service;

import com.example.PetrolPump.Backend.Dto.CustomerDto;

import java.util.List;

public interface CustomerService {
  CustomerDto createcustomer(CustomerDto customerdto);
  CustomerDto findcustomerbyrfid(Long rfid);
  List<CustomerDto> findallcutomer();
  CustomerDto updatecusomer(Long rfid,CustomerDto customerdto);
}
