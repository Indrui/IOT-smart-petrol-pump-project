package com.example.PetrolPump.Backend.Service;

import com.example.PetrolPump.Backend.Dto.CustomerDto;
import com.example.PetrolPump.Backend.Mapper.CustomerMapper;
import com.example.PetrolPump.Backend.Repository.CustomerRepository;
import com.example.PetrolPump.Backend.entity.Customer;
import com.example.PetrolPump.Backend.exception.ResourceNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CustomerServiceimpl implements CustomerService{
    private CustomerRepository customerRepository;
    @Override
    public CustomerDto createcustomer(CustomerDto customerdto) {
        Customer customer= CustomerMapper.maptocustomerdto(customerdto);
         Customer customer1= customerRepository.save(customer);

         return CustomerMapper.maptocustomer(customer1);
    }

    @Override
    public CustomerDto findcustomerbyrfid(Long rfid) {
        Customer customer=customerRepository.findById(rfid)
                .orElseThrow(()->new ResourceNotFoundException("Customer is not found"+rfid));
        return CustomerMapper.maptocustomer(customer);
    }

    @Override
    public List<CustomerDto> findallcutomer() {
        List<Customer> employees=customerRepository.findAll();
        return  employees.stream().map(employee -> CustomerMapper.maptocustomer(employee))
                .collect(Collectors.toList());
    }

    @Override
    public CustomerDto updatecusomer(Long rfid, CustomerDto customerdto) {
        Customer customer=customerRepository.findById(rfid)
                .orElseThrow(()->new ResourceNotFoundException("Employee is not found"+rfid));
        customer.setEmail(customerdto.getEmail());
        customer.setFirstname(customerdto.getFirstName());
        customer.setLastname(customerdto.getLastName());
        customer.setBalanceamount(customerdto.getBalance());
        Customer customer1=customerRepository.save(customer);
        return   CustomerMapper.maptocustomer(customer1);
    }
}
