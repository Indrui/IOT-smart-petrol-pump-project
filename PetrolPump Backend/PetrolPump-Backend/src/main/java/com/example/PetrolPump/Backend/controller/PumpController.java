package com.example.PetrolPump.Backend.controller;

import com.example.PetrolPump.Backend.Dto.CustomerDto;
import com.example.PetrolPump.Backend.Service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/customers")
public class PumpController {
   private  CustomerService customerService;

   @PostMapping
   public ResponseEntity<CustomerDto> addcustomer(@RequestBody CustomerDto customerdto){
       CustomerDto cutomerdto1=customerService.createcustomer(customerdto);
       return new ResponseEntity<>(cutomerdto1, HttpStatus.CREATED);
   }

}
